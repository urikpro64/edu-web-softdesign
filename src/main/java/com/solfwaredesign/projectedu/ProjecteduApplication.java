package com.solfwaredesign.projectedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjecteduApplication {

	@RequestMapping("/")
	String home(){
		return "VVV";
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjecteduApplication.class, args);
	}

}
