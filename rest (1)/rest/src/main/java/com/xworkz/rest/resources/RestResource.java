package com.xworkz.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RestResource {
	
	public RestResource() {
		System.out.println("running  " +this.getClass().getSimpleName());
	}
	
     @GetMapping(produces = "Application/json")
     public String onTest() {
    	 System.out.println("running on test method");
    	 return "Hi welcome to Spring-boot";
     }
}
