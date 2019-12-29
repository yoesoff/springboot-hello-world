package com.ibrahim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HaloDuniaApplication    {

	public static void main(String[] args) {
		System.out.println("Applikasi Halo Dunia mulai!");

		ConfigurableApplicationContext context =  SpringApplication.run(HaloDuniaApplication.class, args);
		HelloWorldService hw = context.getBean(HelloWorldImpl.class);
		hw.sayHello();

		// Inject di Constructor
		InjectedByConstructorService injectedByConstructorService = context.getBean(InjectedByConstructorService.class);
		injectedByConstructorService.getMessage();

		// Inject di Setter
		SetterBasedService setterBasedService = context.getBean(SetterBasedService.class);
		setterBasedService.getMessage();


		
	}

}
