package com.demo_k8s.crud.repository;

import com.demo_k8s.crud.entity.Comment;
import com.demo_k8s.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

