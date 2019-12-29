package com.ibrahim;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {
    public void sayHello() {
        System.out.println("Hello World Kawanku!");
    }
}