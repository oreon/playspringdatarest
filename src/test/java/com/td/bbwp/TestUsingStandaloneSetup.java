package com.td.bbwp;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.td.bbwp.web.action.commerce.CustomerRepository;

/*
public class TestUsingStandaloneSetup {

    private final MockMvc mockMvc = standaloneSetup(CustomerRepository.class)
            .build();

    @Test
    public void validate_get_address() throws Exception {

        mockMvc.perform(get("/address"))
                .andExpect(status().isOk())
                .andExpect(
                        content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.street").value("12345 Horton Ave"));
    }
}*/