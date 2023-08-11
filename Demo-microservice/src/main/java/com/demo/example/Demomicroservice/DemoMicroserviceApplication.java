package com.demo.example.Demomicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoMicroserviceApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello Rupesh welcome in Java world!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroserviceApplication.class, args);
	}

}
