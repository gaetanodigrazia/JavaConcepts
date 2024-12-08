package com.digrazia.business.validator.annotations.lengthControl;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SQLInjectionValidationTest {

    @Autowired
    private MockMvc mockMvc;

    @Nested
    class getUserById {
        @Test
        void whenPathParameterTooLong_thenBadRequest() throws Exception {
            String parameter = "DROP";
            MvcResult mvcResult = mockMvc.perform(get("/api/v1/user/{id}", parameter))
                    .andExpect(status().isBadRequest())
                    .andReturn();

            assertEquals("Trovato comando sql DROP", mvcResult.getResponse().getContentAsString());
            }


        @Test
        void whenPathParameterLengthIsOk_thenOk() throws Exception {
            String parameter = "123";

            mockMvc.perform(get("/api/v1/user/{id}", parameter))
                    .andExpect(status().isOk());
        }

    }

}
