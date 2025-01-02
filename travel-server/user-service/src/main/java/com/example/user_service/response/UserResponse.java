package com.example.user_service.response;

import com.example.user_service.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String email;
    private String username;
    @Autowired
    private User user;
    public UserResponse(User user){
//        this.id = user.getId();
//        this.email = user.getEmail();
//        this.username = user.getUsername();
    }
}
