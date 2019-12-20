package com.unbabel.challenge.controller;

import com.unbabel.challenge.service.MessageServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


public class IndexControllerTest {

    @Mock
    MessageServiceImpl messageService;

    @Mock
    Model model;

    IndexController controller;

    @Before
    public void initialSetUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        controller = new IndexController();
    }

//    @Test
//    public void testMockMvc() throws Exception {
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("index"));
//    }

}