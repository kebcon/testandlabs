package io.mikaila;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ExController {

    @RestController
    public class ExampleController {
        @RequestMapping("/")
        public String hello(){
            return "Hello World!";
        }
    }
}
