package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/")
//    public String helloWorld() {
//        return "Hello from Spring!";
//    }


    @GetMapping("/math/pi")
    public String mathPi(){
        return "3.141592653589793";
    }


}