package com.example.TODO.web.dto.auth;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
