package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondPage {
    @RequestMapping("/next")
    public String homePage2(Model model) {
        model.addAttribute("myvar2", "Say hello to the people.");
        return "secondpage";
    }
}