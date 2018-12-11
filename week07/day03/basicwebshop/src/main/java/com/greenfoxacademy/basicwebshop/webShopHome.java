package com.greenfoxacademy.basicwebshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class webShopHome {

    @RequestMapping(value = "/webshop")
    public String getHome() {
        return "wshome";
    }
}