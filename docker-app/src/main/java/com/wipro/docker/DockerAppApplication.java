package com.wipro.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/dock")
@RestController
@SpringBootApplication
public class DockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerAppApplication.class, args);
	}
	@GetMapping
	public String Welcome() {
		return "Welcome to the Docker";
	}
}
