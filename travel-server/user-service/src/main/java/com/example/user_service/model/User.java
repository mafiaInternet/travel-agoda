package com.example.user_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "email", nullable = false, unique = true)
    @NotNull(message = "Email cannot be null")
    @Email(message = "Invalid email format")
    private String email;
    @Column(name = "username")
    private String username;
    @Column(name = "password", nullable = false)
    @NotNull(message = "Password cannot be null")
    private String password;
    @Column(name = "refreshToken")
    private String refreshToken;
    @Column(name = "role", nullable = false)
    @NotNull(message = "Role cannot be null")
    private int role = 0;
    @Column(name = "last_login_at")
    private LocalDateTime lastLoginAt;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }
}
