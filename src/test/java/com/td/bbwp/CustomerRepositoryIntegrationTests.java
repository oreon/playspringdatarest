/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.td.bbwp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.td.bbwp.commerce.Customer;
import com.td.bbwp.web.action.commerce.CustomerRepository;

/**
 * Integration tests for {@link CustomerRepository}.
 *
 * @author Oliver Gierke
 * @author Andy Wilkinson
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { MainApp.class,
		SecurityConfiguration.class })
@Transactional
public class CustomerRepositoryIntegrationTests {

	@Autowired
	CustomerRepository repository;

	@Before
	public void setup() throws Exception {

		try {

			//SecurityContextHolder.getContext().setAuthentication(
			//		new UsernamePasswordAuthenticationToken("admin", "mohali",
			//				AuthorityUtils.createAuthorityList("ROLE_ADMIN")));

			repository.deleteAll();

			Customer customer = new Customer();
			customer.setFirstName("Subha");
			customer.setLastName("Chatterjee");
			repository.save(customer);

			Customer customer3 = new Customer();
			customer3.setFirstName("Subha");
			customer3.setLastName("Muka");
			repository.save(customer3);

			Customer customer2 = new Customer();
			customer2.setFirstName("Jag");
			customer2.setLastName("Singh");
			repository.save(customer2);

		} catch (AccessDeniedException ade) {
			System.out.println(ade.getMessage());
		}

		/*
		 * 
		 * this.mockMvc = webAppContextSetup(webApplicationContext).build();
		 * 
		 * this.bookmarkRepository.deleteAllInBatch();
		 * this.accountRepository.deleteAllInBatch(); this.account =
		 * accountRepository .save(new Account(userName, "password"));
		 * this.bookmarkList.add(bookmarkRepository.save(new Bookmark(account,
		 * "http://bookmark.com/1/" + userName, "A description")));
		 * this.bookmarkList.add(bookmarkRepository.save(new Bookmark(account,
		 * "http://bookmark.com/2/" + userName, "A description")));
		 */
	}

	@Test(expected = AccessDeniedException.class)
	@WithUserDetails("msclerk")
	public void findsFirstPageOfCitiesForbidden() {
		Page<Customer> cities = this.repository.findAll(new PageRequest(0, 10));
		assertThat(cities.getTotalElements()).isGreaterThan(1L);
	}

	@Test
	@WithUserDetails("admin")
	public void findFirstPageOfCities() {
		Page<Customer> cities = this.repository.findAll(new PageRequest(0, 10));
		assertThat(cities.getTotalElements()).isGreaterThan(1L);
	}

	@Test//(expected=AccessDeniedException.class)
	@WithMockUser(username = "admin", roles = { "ADMIN" })
	public void findByNameAndCountry() {
		Customer city = this.repository.findByLastNameIgnoringCase("singh");
		assertThat(city).isNotNull();
		assertThat(city.getDisplayName()).isEqualTo("Jag");
	}

    @Test
	@WithMockUser(username = "joe", roles = { "ADMIN", "MANAGER" })
	public void findContaining() {
		Page<Customer> cities = this.repository
				.findByFirstNameContainingAllIgnoringCase("Subha",
						new PageRequest(0, 10));
		assertThat(cities.getTotalElements()).isEqualTo(2L);
	}
}