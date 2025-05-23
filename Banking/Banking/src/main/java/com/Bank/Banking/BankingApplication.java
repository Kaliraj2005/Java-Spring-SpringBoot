package com.Bank.Banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BankingApplication
{
	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}
}

@RestController
class MyController {

	@GetMapping("/")
	public String home() {
		return "Welcome to the home page!";
	}
}
