package com.example.UserManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private Integer phoneNumber;
}
