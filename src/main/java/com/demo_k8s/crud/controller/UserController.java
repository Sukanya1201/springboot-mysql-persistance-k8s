package com.demo_k8s.crud.controller;

import com.demo_k8s.crud.entity.Comment;
import com.demo_k8s.crud.entity.User;
import com.demo_k8s.crud.service.CommentService;
import com.demo_k8s.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User addComments(@RequestBody User comment){
        return service.addUser(comment);
    }

    @GetMapping
    public List<User> getUsers(){
        return service.getUsers();
    }
}
