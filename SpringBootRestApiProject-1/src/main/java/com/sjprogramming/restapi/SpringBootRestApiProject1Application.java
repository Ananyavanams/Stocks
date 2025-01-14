package com.sjprogramming.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class SpringBootRestApiProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiProject1Application.class, args);
	}
	
	@GetMapping("/")
	public String getName() {
		return "Hello you have done it!!!";
	}
	

}
