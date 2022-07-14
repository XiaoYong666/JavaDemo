package com.example.demo_jpa.controller;

import com.example.demo_jpa.dao.UserRepository;
import com.example.demo_jpa.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserRepository userRepository;

    @RequestMapping("/")
    public List<Student> getUsers(){
//       userRepository.findAll();
        return  userRepository.getAllBySql();
    }
}
