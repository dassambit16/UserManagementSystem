package com.example.UserManagementSystem.Service;

import com.example.UserManagementSystem.Entity.User;
import com.example.UserManagementSystem.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void addUsers(User user) {
        userRepo.getUserMap().put(user.getUserId(), user);
    }

    public Map<Integer, User> getAllUsers() {
        return userRepo.getUserMap();
    }

    public String updateUser(Integer uId, User users) {
        userRepo.getUserMap().put(users.getUserId(), users);
        return "added";
    }

    public User getUsersById(Integer uId) {
        Map<Integer, User> userList = userRepo.getUserMap();
        for (Map.Entry<Integer,User> mapElement : userList.entrySet()) {
            if(mapElement.getValue().getUserId()==uId){
                return mapElement.getValue();
            }

        }
        return null;
    }

    public String removeUser(Integer uId) {
        Map<Integer, User> userList = getUsers();
        User user = userList.get(uId);
        if(user!=null)
        {
            userList.remove(uId);
            return uId + " removed!!!";
        }
        else {
            return uId + " not found!!!";
        }
    }

    public Map<Integer, User> getUsers() {
        return userRepo.getUserMap();
    }
}
