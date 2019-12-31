package com.ibrahim.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldEnglishImpl implements HelloWorldService {

    public String getGreeting() {
        return "Hello World in English!";
    }

}