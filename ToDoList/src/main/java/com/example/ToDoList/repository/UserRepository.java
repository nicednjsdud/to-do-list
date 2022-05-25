package com.example.ToDoList.repository;

import com.example.ToDoList.user.vo.User;

public interface UserRepository {

    void save(User user);

    User findById(String userId);
}
