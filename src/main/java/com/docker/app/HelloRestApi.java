package com.docker.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApi {

	@GetMapping("/")
	public String Hello()
	{
		return "Hi ! I am working";
	}
	
	
}
