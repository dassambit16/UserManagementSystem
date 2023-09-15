package com.example.UserManagementSystem.Repo;

import com.example.UserManagementSystem.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepo {

    @Autowired
    Map<Integer, User> userMap;

    public Map<Integer, User> getUserMap() {
        return userMap;
    }
}
