package com.example.ToDoList.user.vo;

import com.example.ToDoList.user.vo.User;

public interface UserService {

    void join(User user);

    User findUser(String userId);
}
