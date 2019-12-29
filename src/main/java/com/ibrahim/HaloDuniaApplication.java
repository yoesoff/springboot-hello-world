package com.ibrahim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HaloDuniaApplication    {

	public static void main(String[] args) {
		System.out.println("Applikasi Halo Dunia mulai!");
		ApplicationContext context1 =  SpringApplication.run(HaloDuniaApplication.class, args);
		ConfigurableApplicationContext context2 =  SpringApplication.run(HaloDuniaApplication.class, args);

		Alien alien = context1.getBean(Alien.class);
		Alien alien2 = context2.getBean(Alien.class);

		alien.sayHello();
		alien2.sayHello();
	}

}
