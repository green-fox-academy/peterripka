package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController         //does NOT look for html file
public class HelloRESTController {
    @RequestMapping(value = "/greeting")
//
//    public Greeting greeting() {
//        return new Greeting( 1, "Hello, World!" );
//
//    }

    public Greeting greeting(@RequestParam(name = "name") String name) {
        return new Greeting( 1, "Hello, " + name + "!" );


    }
}
