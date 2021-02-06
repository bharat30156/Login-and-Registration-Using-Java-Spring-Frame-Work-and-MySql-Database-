package com.Bharat.LoginAndRegistration.service;

import com.Bharat.LoginAndRegistration.model.User;
import com.Bharat.LoginAndRegistration.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
