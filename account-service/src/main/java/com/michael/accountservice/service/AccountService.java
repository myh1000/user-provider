package com.michael.accountservice.service;

import com.michael.accountservice.dto.UserDto;
import com.michael.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
