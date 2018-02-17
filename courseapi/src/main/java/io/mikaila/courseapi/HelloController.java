package io.mikaila.courseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Make this a RestController by using the annotation
@RestController //annotation
public class HelloController {

    //Map this so that this method is called  when visitors go to endpoint
    @RequestMapping("/home")
    public String sayHi(){
     return "Welcome to my fabulous homepage";
    }
}
