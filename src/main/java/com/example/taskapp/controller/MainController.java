package com.example.taskapp.controller;

import com.example.taskapp.service.CategoryService;
import com.example.taskapp.service.TaskService;
import com.example.taskapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class    MainController {
    @Autowired
    UserService userService;
    @Autowired
    TaskService taskService;
    @Autowired
    CategoryService categoryService;


    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
