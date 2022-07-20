package com.example.springbootdtovalidation.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    
    String name, email, mobile;
    Integer age;
    
}
