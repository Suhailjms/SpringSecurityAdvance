package com.eventhub.suhail.service;

import java.io.IOException;

import com.eventhub.suhail.dto.request.LoginRequest;
import com.eventhub.suhail.dto.request.RegisterRequest;
import com.eventhub.suhail.dto.response.LoginResponse;
import com.eventhub.suhail.dto.response.RegisterResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
