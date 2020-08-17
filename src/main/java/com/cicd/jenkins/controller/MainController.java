package com.cicd.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping
	public String showHomePage()
	{
		return "Hello World!";
	}

}
