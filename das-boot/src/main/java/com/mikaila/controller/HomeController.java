package com.mikaila.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Make it a springMVC application
public class HomeController {

    @RequestMapping("/")  //root url
    public String home(){
        return "Das Boot reporting for duty";

    }
}
