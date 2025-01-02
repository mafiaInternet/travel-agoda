package com.example.admin_service.repository.httpclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "user-service", url = "http://localhost:8080/user")
public interface UserClient {
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    String helloApiGateway();
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Object> getAllUserByAdmin();
}
