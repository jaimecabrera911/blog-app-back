package com.blogapp.controller;

import com.blogapp.domain.entity.UserEntity;
import com.blogapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/email/{email}")
    public ResponseEntity<?> findUserByEmail(@PathVariable String email) throws Exception {
        try {
            return ResponseEntity.ok(userService.findUserByEmail(email));
        } catch (Exception exception) {
            log.error("{}{}", exception, exception.getMessage());
            return ResponseEntity.badRequest().body(exception);
        }
    }
}
