package com.ibrahim.services;

public class HelloWorldFactory {
    public HelloWorldService createHelloWorldService(String lang) {
        HelloWorldService service = null;
        switch (lang) {
            case "eng":
                service = new HelloWorldEnglishImpl();
                break;
            case "indo":
                service = new HelloWorldIndoImpl();
                break;
            case "sunda":
                service = new HelloWorldSundaImpl();
                break;
            case "jawa":
                service = new HelloWorldJawaImpl();
                break;
            case "padang":
                service = new HelloWorldPadangImpl();
                break;
            default: service = new HelloWorldEnglishImpl();
        }

        return service;
    }
}