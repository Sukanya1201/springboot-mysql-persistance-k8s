package com.demo_k8s.crud.service;

import com.demo_k8s.crud.entity.Comment;
import com.demo_k8s.crud.entity.User;
import com.demo_k8s.crud.repository.CommentRepository;
import com.demo_k8s.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User addUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }
}
