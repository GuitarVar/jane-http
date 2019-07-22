package com.example.exercisspringboot.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class usersController {

    @RequestMapping("/ssss")

    public String usersControllerTest(){
        return "";
    }
}
