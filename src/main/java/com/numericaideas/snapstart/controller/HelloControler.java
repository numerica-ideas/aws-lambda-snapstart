package com.numericaideas.snapstart.controller;

import com.numericaideas.snapstart.model.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/hello")
    public Hello helloAction() {
        return new Hello("Hello: SpringBoot + Lambda API + SnapStart");
    }
    
}
