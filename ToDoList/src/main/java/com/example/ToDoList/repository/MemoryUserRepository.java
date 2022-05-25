package com.example.ToDoList.repository;

import com.example.ToDoList.repository.UserRepository;
import com.example.ToDoList.user.vo.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryUserRepository implements UserRepository {

    private static Map<String,User> list = new HashMap<>();

    @Override
    public void save(User user) {
        list.put(user.getUserId(),user);
    }

    @Override
    public User findById(String userId) {
        return list.get(userId);
    }
}
