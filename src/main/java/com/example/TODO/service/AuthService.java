package com.example.TODO.service;

import com.example.TODO.web.dto.auth.JwtRequest;
import com.example.TODO.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
