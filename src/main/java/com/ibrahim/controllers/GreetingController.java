package com.ibrahim.controllers;

import com.ibrahim.services.HelloWorldFactory;
import com.ibrahim.services.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GreetingController {

    @Autowired
    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceJawa; 

    private HelloWorldService helloWorldServiceSunda; 

    @Autowired
    public void setHelloWorldServiceJawa(HelloWorldFactory factory) {
        this.helloWorldServiceJawa = factory.createHelloWorldService("jawa");
    }

    @Autowired
    public void setHelloWorldServiceSunda(HelloWorldFactory factory) {
        this.helloWorldServiceSunda = factory.createHelloWorldService("sunda");
    }

    private HelloWorldService helloWorldServicePadang;
    
    @Autowired
    // @Qualifier("helloWorldPadangImpl")
    @Qualifier("padang")
    public void setHelloWorldServicePadang(HelloWorldService helloWorldServicePadang) {
        this.helloWorldServicePadang = helloWorldServicePadang;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println("Default: " + greeting);

        greeting = helloWorldServiceJawa.getGreeting();
        System.out.println("Jawa: " + greeting);

        greeting = helloWorldServiceSunda.getGreeting();
        System.out.println("Sunda: " + greeting);

        greeting = helloWorldServicePadang.getGreeting();
        System.out.println("Padang: " + greeting);

        return greeting;
    }

}