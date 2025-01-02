package com.example.user_service.service.Impl;

import com.example.user_service.model.User;
import com.example.user_service.request.UserLoginRequest;
import com.example.user_service.respository.UserRepository;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository =userRepository;
    }
    @Override
    public List<User> findAllUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }
    @Override
    public User findUserById(String id){
        return userRepository.findById(id).get();
    }
    @Override
    @Transactional
    public void deleteUserById(List<String> ids){
        for(String id : ids){
            userRepository.deleteById(id);
        }
    }
    @Override
    public User updateUser(User user, String id){
        Optional<User> userUpdate = userRepository.findById(id);
//        userUpdate.get().setEmail(user.getEmail());
//        userUpdate.get().setUsername(user.getUsername());
//        if(user.getPassword() != null){
//            userUpdate.get().setPassword(user.getPassword());
//        }

        return userUpdate.get();
    }
    @Override
    public User register(User user){
        return userRepository.save(user);
    }
    @Override
    public User login(UserLoginRequest userLoginRequest){
        for (User user: userRepository.findAll()){
//                if(user.getEmail().equalsIgnoreCase(userLoginRequest.getEmail()) && user.getPassword().equalsIgnoreCase(userLoginRequest.getPassword())){
//                    return user;
//                }
        }
        return null;
    }

}
