package com.kairos.controller;

import com.kairos.service.FizzBuzzService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Basic Integration test to prove validity of endpoint.
 *
 * @author Stephen Foster
 */
@RunWith(SpringRunner.class)
@WebMvcTest(FizzBuzzController.class)
public class FizzBuzzControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @MockBean
    private FizzBuzzService fizzBuzzService;

    private MockMvc mockMvc;
    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void fizzBuzzGet() throws Exception {

        assert(this.fizzBuzzService != null);
        when(this.fizzBuzzService.processFizzBuzz(3)).thenReturn("Fizz");

        this.mockMvc.perform(get("/3"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.response").value("Fizz"))
                .andReturn();
    }

}