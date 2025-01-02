package com.example.user_service.service;

import com.example.user_service.model.User;
import com.example.user_service.request.UserLoginRequest;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findUserById(String id);

    void deleteUserById(List<String> ids);

    User updateUser(User user, String id);

    User register(User user);

    User login(UserLoginRequest userLoginRequest);
}
