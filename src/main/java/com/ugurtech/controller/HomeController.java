package com.ugurtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping
    public String welcomePate(Model model) {
        model.addAttribute("classConfig", messageSource.getMessage("project.version", null, Locale.ENGLISH));
        return "homePage";
    }
}
