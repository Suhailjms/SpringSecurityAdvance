package com.eventhub.suhail.service;

import java.security.Principal;

import com.eventhub.suhail.dto.request.PasswordRequest;

public interface UserService {

    void forgotPassword(PasswordRequest request, Principal principal);

}
