package com.siren.department.service;

import com.siren.department.entity.DepartmentUser;
import com.siren.department.repository.DepartmentUserRepository;
import com.siren.department.security.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    DepartmentUserRepository repository;

    @Autowired
    JwtUtil jwtUtil;

    public String login(String username, String password) {

        DepartmentUser user = repository.findByUsername(username)
                .orElseThrow();

        if(!user.getPassword().equals(password))
            throw new RuntimeException("Invalid credentials");

        return jwtUtil.generateToken(username);

    }

}