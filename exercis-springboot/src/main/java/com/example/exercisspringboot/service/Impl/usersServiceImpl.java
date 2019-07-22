package com.example.exercisspringboot.service.Impl;

import com.example.exercisspringboot.dao.usersDao;
import com.example.exercisspringboot.pojo.users;
import com.example.exercisspringboot.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class usersServiceImpl implements usersService {
    @Autowired
    private usersDao usersDao;

    @Override
    public Optional<users> findByuid(Integer uid) {

        return usersDao.findById(1);
    }
}
