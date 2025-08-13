package com.hraj.practiceSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyClass {
    @GetMapping("raj")
    public String sayHello(){
        return "Hello";
    }
}
