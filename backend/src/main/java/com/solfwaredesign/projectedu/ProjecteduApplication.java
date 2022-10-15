package com.solfwaredesign.projectedu;

import com.solfwaredesign.projectedu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProjecteduApplication {

	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjecteduApplication.class, args);
	}

}
