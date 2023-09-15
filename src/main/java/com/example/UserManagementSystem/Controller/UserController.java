package com.example.UserManagementSystem.Controller;

import com.example.UserManagementSystem.Entity.User;
import com.example.UserManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody User user) {
        System.out.println(user.getUserName());
        userService.addUsers(user);
        return "added";
    }

    @GetMapping("getUser")
    public Map<Integer, User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("users/{uId}")
    public User getUsersbyId(@PathVariable Integer uId){
        return userService.getUsersById(uId);
    }

    @PutMapping("users/{uId}")
    public String updateUser(@PathVariable Integer uId,@RequestBody User users){
        return userService.updateUser(uId,users);
    }

    @DeleteMapping("users/{uId}")
    public String removeUser(@PathVariable Integer uId)
    {
        return userService.removeUser(uId);
    }

}
