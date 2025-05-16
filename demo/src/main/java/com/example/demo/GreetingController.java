package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class GreetingController {

	@GetMapping(value = "/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue  = "World") String name){
		return (new Greeting(name).getGreeting());
	}

    
}
