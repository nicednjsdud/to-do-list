package com.example.ToDoList;

import com.example.ToDoList.repository.UserRepository;
import com.example.ToDoList.repository.MemoryUserRepository;
import com.example.ToDoList.user.dao.UserService;
import com.example.ToDoList.user.dao.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
