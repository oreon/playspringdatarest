package com.td.bbwp.commerce.repositorytests;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.td.bbwp.SecurityConfiguration;
import com.td.bbwp.MainApp;

import com.td.bbwp.commerce.CustomerOrder;

/**
 * DB tests for {@link CustomerRepository}.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {MainApp.class,
		SecurityConfiguration.class})
@Transactional
public class CustomerOrderRepositoryIntegrationTestBase {

	@Autowired
	protected com.td.bbwp.web.action.commerce.CustomerOrderRepository customerOrderRepository;

	protected com.td.bbwp.commerce.testdata.CustomerOrderTestDataFactory customerOrderTestDataFactory = new com.td.bbwp.commerce.testdata.CustomerOrderTestDataFactory();

	CustomerOrder customerOrder;

	@Before
	public void setup() throws Exception {

		try {
			customerOrderRepository.deleteAll();
			customerOrder = customerOrderTestDataFactory
					.createCustomerOrderOne();
			customerOrderRepository.save(customerOrder);

		} catch (AccessDeniedException ade) {
			System.out.println(ade.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	@WithMockUser(username = "admin", roles = {"ADMIN"})
	public void findOne() {
		assertCount(1L);
	}

	@Test
	@WithMockUser(username = "admin", roles = {"ADMIN"})
	public void findById() {
		CustomerOrder temp = customerOrderRepository.findOne(customerOrder
				.getId());
		assertThat(temp).isNotNull();
	}

	@Test
	@WithMockUser(username = "admin", roles = {"ADMIN"})
	public void testEdit() throws IllegalAccessException,
			InvocationTargetException {
		Long currentId = customerOrder.getId();
		BeanUtils.copyProperties(customerOrder,
				customerOrderTestDataFactory.createCustomerOrderTwo());
		customerOrder.setId(currentId);
		customerOrderRepository.save(customerOrder);
		assertCount(1L);
	}

	@Test
	@WithMockUser(username = "admin", roles = {"ADMIN"})
	public void testDelete() {
		customerOrderRepository.delete(customerOrder);
		assertCount(0L);
	}

	@Test(expected = AccessDeniedException.class)
	@WithMockUser(username = "mrmanager", roles = {"MANAGER"})
	public void testDeleteWithoutPreviliges() {
		customerOrderRepository.delete(customerOrder);
		assertCount(0L);
	}

	public void assertCount(long assertCount) {
		Long count = customerOrderRepository.count();
		assertThat(count).isEqualTo(assertCount);
	}

}
