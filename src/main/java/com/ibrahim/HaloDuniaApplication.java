package com.ibrahim;

import com.ibrahim.controllers.GreetingController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HaloDuniaApplication    {

	public static void main(String[] args) {
		System.out.println("Applikasi Halo Dunia mulai!");

		ConfigurableApplicationContext context = SpringApplication.run(HaloDuniaApplication.class, args);


		GreetingController hw = context.getBean(GreetingController.class);
		hw.sayHello();

		// System.out.println(HaloDuniaApplication.class);
		// System.out.println(HaloDuniaApplication.class.getName());

		// // Inject di Constructor
		// InjectedByConstructorService injectedByConstructorService = context.getBean(InjectedByConstructorService.class);
		// injectedByConstructorService.getMessage();

		// // Inject di Setter
		// SetterBasedService setterBasedService = context.getBean(SetterBasedService.class);
		// System.out.println("Hei ini setter based injection");
		// setterBasedService.getMessage();
		
	}

}
