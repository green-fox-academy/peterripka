package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloEarthController {

    @RequestMapping("/web/greetingstoall")
    public String greeting(@RequestParam String name, Model model) {
        Greeting greet = new Greeting( 0, name );
        Hello hello = new Hello();
        model.addAttribute( "name", name );
        model.addAttribute( "atomic", greet.getId() );
        model.addAttribute( "fontColor", hello.getRandomColor() );
        model.addAttribute( "fontSize", hello.getRandomSize() );
        model.addAttribute( "hello", hello.getRandomHello() );
        return "greetingstoall";
    }
}

