package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldWide {
	
	@RequestMapping("/hello")
	public String test() 
	{
		return "spring boot";
	}
	

}
