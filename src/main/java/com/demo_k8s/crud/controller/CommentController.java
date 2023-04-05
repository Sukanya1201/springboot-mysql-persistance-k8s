package com.demo_k8s.crud.controller;

import com.demo_k8s.crud.entity.Comment;
import com.demo_k8s.crud.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService service;

    @PostMapping
    public Comment addComments(@RequestBody Comment comment){
        return service.addComment(comment);
    }

    @GetMapping
    public List<Comment> getComments(){
        return service.getComments();
    }

    @GetMapping("/hello-world")
    public String hello(){
        return "OK";
    }

    @GetMapping("/{id}")
    public Comment getCommentsById(@PathVariable int id){
        return service.getCommentById(id);
    }
}
