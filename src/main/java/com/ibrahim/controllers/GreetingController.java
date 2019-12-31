package com.ibrahim.controllers;

import java.util.logging.Logger;

import com.ibrahim.services.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @Autowired
    private HelloWorldService helloWorldService; 

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}