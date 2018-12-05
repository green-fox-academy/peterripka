package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebGreetCounter {


    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        Greeting greeting = new Greeting( 0, name );
        model.addAttribute("name", name);
        model.addAttribute("atomic", greeting.getId());
        return "greeting";
    }
}
