package com.ibrahim.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("indo")
public class HelloWorldIndoImpl implements HelloWorldService {

    public String getGreeting() {
        
        return "Halow Dunia dalam bahasa Indo!";
    }

}