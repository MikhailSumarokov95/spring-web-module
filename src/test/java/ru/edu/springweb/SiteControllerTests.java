package ru.edu.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import ru.edu.springweb.controller.SiteController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SiteController.class)
public class SiteControllerTests {

    @Autowired
    MockMvc mvc;

    @Test
    public void getWelcomePageTest() throws Exception {
        mvc.perform(get("/welcome"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void getHobbyPageTest() throws Exception {
        mvc.perform(get("/welcome/hobby"))
                .andExpect(status().is2xxSuccessful());
    }
}
