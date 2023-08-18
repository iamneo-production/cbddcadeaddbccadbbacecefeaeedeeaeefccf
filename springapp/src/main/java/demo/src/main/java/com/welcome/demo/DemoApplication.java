package com.welcome.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
     @GetMapping("/hello")
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
