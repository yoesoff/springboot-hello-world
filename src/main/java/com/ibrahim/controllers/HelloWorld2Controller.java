package com.ibrahim.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*
* @author manoj.bardhan
*
*/
@Controller
@EnableAutoConfiguration
public class HelloWorld2Controller {
	@RequestMapping("/hello2")
	@ResponseBody
	public String sayHello() {
		return "Hello World Developer 2!!!";
	}
}
