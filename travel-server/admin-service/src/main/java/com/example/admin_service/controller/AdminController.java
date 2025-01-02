package com.example.admin_service.controller;

import com.example.admin_service.repository.httpclient.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserClient userClient;
    public AdminController(UserClient userClient){
        this.userClient = userClient;
    }
    @GetMapping("/")
    public String helloword(){
        String client = userClient.helloApiGateway();
        return "hello" + client;
    }
}
