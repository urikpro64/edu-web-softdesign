package com.solfwaredesign.projectedu.controller;

import com.solfwaredesign.projectedu.models.LoginValid;
import com.solfwaredesign.projectedu.models.User;
import com.solfwaredesign.projectedu.repository.UserRepository;
import com.solfwaredesign.projectedu.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController extends SequenceGeneratorService{

    @Autowired
    UserRepository userRepository;

    public UserController(MongoOperations mongoOperations) {
        super(mongoOperations);
    }

    @GetMapping("/users/all")
    public List<User> getAllUser(){
        List<User> users = userRepository.findAll();
        return users;
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable long id){
        Optional<User> optionalUser= userRepository.findById(id);
        System.out.println(optionalUser);
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    @PostMapping("/users/add")
    @ResponseBody
    public User createUser(@RequestBody User user){
        user.setID(generateSequence(User.SEQUENCE_NAME));
        System.out.println(user);
        return userRepository.save(user);
    }

    @GetMapping ("/users/deleteAll")
    public void deleteAllUser(){
        try {
            userRepository.deleteAll();
        }
        catch (Exception e){

        }
    }

    @PostMapping ("/login")
    @ResponseBody
    public LoginValid login(@RequestBody LoginValid loginValid){
        List<User> users = getAllUser();
        loginValid.login(users);
        return loginValid;
    }

}
