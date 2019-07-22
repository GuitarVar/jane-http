package com.example.exercisspringboot.service;

import com.example.exercisspringboot.pojo.users;

import java.util.Optional;

public interface usersService {
    Optional<users> findByuid(Integer uid);
}
