package com.td.bbwp;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

//import static org.assertj.core.api.Assertions
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@ContextConfiguration(classes = {MainApp.class,  SecurityConfiguration.class}) //load your mvc config classes here
//@WebIntegrationTest("server.port:0")   // 4
public class MockMvcTest {
	protected MockMvc mockMvc;
 
    @Autowired
    private WebApplicationContext webApplicationContext;
 
    @Before
    public final void initMockMvc() throws Exception {
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }
 
	@Test
	//@WithUserDetails("admin")
	@WithMockUser(username = "admin", roles = { "ADMIN" })
    public void rootWitAdmin() throws Exception {
		mockMvc.perform(
        	get("/customers")
        )
		.andExpect(status().isOk())
		.andExpect(content().contentType("application/hal+json"));
    }
	
	@Test(expected = AccessDeniedException.class)
	@WithMockUser(username = "admin", roles = { "CLERK" })
    public void rootWitClerk() throws Exception {
		mockMvc.perform(
        	get("/customers")
        )
		.andExpect(status().isForbidden())
		.andExpect(content().contentType("application/hal+json"));
    }
	
	
}