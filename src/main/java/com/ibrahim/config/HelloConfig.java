package com.ibrahim.config;

import com.ibrahim.services.HelloWorldEnglishImpl;
import com.ibrahim.services.HelloWorldFactory;
import com.ibrahim.services.HelloWorldIndoImpl;
import com.ibrahim.services.HelloWorldService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    // Dengan factory pattern
    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Primary
    @Profile({"default", "indo"})
    public HelloWorldService helloWorldIndoImpl() {
        return new HelloWorldIndoImpl();
    }

    @Bean
    @Profile({"english"})
    public HelloWorldService helloWorldEnglishImpl() {
        return new HelloWorldEnglishImpl();
    }

    @Bean
    public HelloWorldService helloWorldSundaImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("sunda");
    }

    @Bean
    public HelloWorldService helloWorldJawaImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("jawa");
    }

    @Bean(name="padang")
    public HelloWorldService helloWorldPadangImpl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("padang");
    }

}