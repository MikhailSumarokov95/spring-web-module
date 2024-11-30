package ru.edu.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcome")
public class SiteController {

    @GetMapping()
    public String getWelcomePage() {
        return "site/welcome";
    }

    @GetMapping("/hobby")
    public String getHobbyPage() {
        return "site/hobby";
    }
}
