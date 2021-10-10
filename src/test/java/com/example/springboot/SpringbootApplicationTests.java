package com.example.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "web")
class SpringbootApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplicationTests.class, args);
	}

}
