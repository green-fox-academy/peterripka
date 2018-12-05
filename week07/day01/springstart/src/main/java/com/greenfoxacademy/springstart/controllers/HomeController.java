package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {
    @RequestMapping(value = "/hello")        // when someone visits root, then run method home
//    @ResponseBody // it returns the string "hello, without calling html
    public String home() {
        return "hello";         // it calls html file named hello, with the content of it
    }
}
