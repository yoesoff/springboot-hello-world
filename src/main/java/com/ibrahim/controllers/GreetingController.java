package com.ibrahim.controllers;

import com.ibrahim.services.HelloWorldService;

public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceJawa; 

    private HelloWorldService helloWorldServiceSunda; 

    private HelloWorldService helloWorldServicePadang;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServiceJawa(HelloWorldService helloWorldServiceJawa) {
        this.helloWorldServiceJawa = helloWorldServiceJawa;
    }

    public void setHelloWorldServiceSunda(HelloWorldService helloWorldServiceSunda) {
        this.helloWorldServiceSunda = helloWorldServiceSunda;
    }

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