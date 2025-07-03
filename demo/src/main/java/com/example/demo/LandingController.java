package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {
    
    @RequestMapping(value = "/")
	public String landing(){
		return (new Landing("Hi Anika").getDisplay());
	}

}
