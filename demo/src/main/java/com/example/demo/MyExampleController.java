package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyExampleController {
    @RequestMapping
    public String helloMethod(){
        return " Hello world";
    }
}
