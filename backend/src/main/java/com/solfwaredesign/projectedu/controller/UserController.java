package com.solfwaredesign.projectedu.controller;

import com.solfwaredesign.projectedu.models.User;
import com.solfwaredesign.projectedu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/users/{id}")
    public User createUserById(@PathVariable String id){
        User user = new User(id, "152sda", "Pro", "urikpro64@gmail.com");
        userRepository.save(user);
        return user;
    }


}
