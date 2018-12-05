package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Pet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeadogController {
    @RequestMapping("/seadog")
    public String hello() {
        return "hello Seadog!";

    }
    @RequestMapping ("/pet")
    public Pet pet(){
        return new Pet("P");
    }
}
