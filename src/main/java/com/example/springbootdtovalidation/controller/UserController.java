package com.example.springbootdtovalidation.controller;

import com.example.springbootdtovalidation.dto.UserRequestDTO;
import com.example.springbootdtovalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired  private UserService userService;

    @PostMapping(path = "/users")
    public String save(@RequestBody @Valid UserRequestDTO userRequest){
        return new ResponseEntity<>(userService.save(userRequest) , HttpStatus.CREATED).toString();
    }

}
