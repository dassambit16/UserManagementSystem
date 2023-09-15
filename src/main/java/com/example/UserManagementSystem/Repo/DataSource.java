package com.example.UserManagementSystem.Repo;

import com.example.UserManagementSystem.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {

    @Bean
    Map<Integer, User> datasource() {
        return new HashMap<>();
    }
}
