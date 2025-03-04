package com.daimlertruck.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringAzureAppApplication {
	
	@GetMapping("/greet")
	public String greetMe()
	{
		return "Hello Abhishek Baheti";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAzureAppApplication.class, args);
	}

}
