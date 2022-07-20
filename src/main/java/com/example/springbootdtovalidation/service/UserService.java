package com.example.springbootdtovalidation.service;


import com.example.springbootdtovalidation.dto.UserRequestDTO;
import com.example.springbootdtovalidation.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public User save(UserRequestDTO userRequest) {
        return User.builder().name(userRequest.getName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .age(userRequest.getAge()).build();
    }

}
