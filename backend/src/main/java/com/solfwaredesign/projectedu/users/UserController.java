package com.solfwaredesign.projectedu.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id){
        UserResponse userResponse = new UserResponse(id, "Pro", "urikpro64@gmail.com");
        return  userResponse;
    }
}
