package com.example.user_service.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserLoginRequest {
    private String email;
    private String password;
}
