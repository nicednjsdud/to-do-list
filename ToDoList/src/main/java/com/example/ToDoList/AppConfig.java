package com.example.ToDoList;

import com.example.ToDoList.user.UserRepository;
import com.example.ToDoList.user.dao.MemoryUserRepository;
import com.example.ToDoList.user.vo.UserService;
import com.example.ToDoList.user.vo.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService(){
        return new UserServiceImpl(userRepository());
    }
    @Bean
    public UserRepository userRepository(){
        return new MemoryUserRepository();
    }
}
