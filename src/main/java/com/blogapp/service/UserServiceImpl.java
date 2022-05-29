package com.blogapp.service;

import com.blogapp.domain.entity.UserEntity;
import com.blogapp.domain.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserEntityRepository userEntityRepository;


    @Override
    public UserEntity findUserByEmail(String email) throws Exception {
        Optional<UserEntity> userEntityByEmail = userEntityRepository.findUserEntityByEmail(email);

        return userEntityByEmail.orElseThrow(() -> new Exception("Error: Usuario no encontrado"));

    }
}
