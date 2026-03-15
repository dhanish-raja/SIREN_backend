package com.siren.department.controller;

import com.siren.department.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dept")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password) {

        return authService.login(username, password);

    }

}