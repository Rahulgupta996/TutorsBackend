package com.example.tutorsbackend.controllers;

import ch.qos.logback.core.model.Model;
import com.example.tutorsbackend.model.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String showName(){
        return "Hello World";
    }

    @GetMapping("/rahul")
    public String getName(){
        return "Hello Rahul";
    }

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){

        UserModel user = new UserModel();
        model.addAttribute("user", user);
        return "register";
    }

    @GetMapping("/users")
    public String users(Model model){
        List<UserModel> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
}
