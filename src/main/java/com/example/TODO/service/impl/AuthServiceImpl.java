package com.example.TODO.service.impl;

import com.example.TODO.service.AuthService;
import com.example.TODO.web.dto.auth.JwtRequest;
import com.example.TODO.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }

}
