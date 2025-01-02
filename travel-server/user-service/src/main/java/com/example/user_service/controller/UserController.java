package com.example.user_service.controller;

import com.example.user_service.model.User;
import com.example.user_service.request.UserLoginRequest;
import com.example.user_service.response.UserResponse;
import com.example.user_service.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<String> helloApiGateway(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserResponse>> getUsers(){
        List<UserResponse> users = userService.findAllUsers()
                .stream()
                .map(user -> new UserResponse(user))
                .collect(Collectors.toList());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathParam("id") String id){
        User user = userService.findUserById(id);
        return new ResponseEntity<>(new UserResponse(user), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUserById(@PathParam("id") List<String> ids){
        userService.deleteUserById(ids);
        return new ResponseEntity<>("Delete user success!!! ", HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<UserResponse> updateUser(@PathParam("id") String id, @RequestBody User userReq){
        User user = userService.updateUser(userReq, id);
        return new ResponseEntity<>(new UserResponse(user), HttpStatus.ACCEPTED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> userLogin(@RequestBody UserLoginRequest userLoginRequest){
        User user = userService.login(userLoginRequest);
        return new ResponseEntity<>(new UserResponse(user), HttpStatus.OK);
    }
}
