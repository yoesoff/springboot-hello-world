package com.ibrahim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedService {
    @Autowired
    private HelloWorldService helloWorldService;

    public void getMessage() {
        helloWorldService.sayHello();
    }   
}