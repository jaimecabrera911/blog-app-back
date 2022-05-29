package com.blogapp.service;

import com.blogapp.domain.entity.UserEntity;

public interface UserService {

    UserEntity findUserByEmail(String email) throws Exception;
}
