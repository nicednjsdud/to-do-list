package com.example.ToDoList.user;

public interface UserService {

    void join(User user);

    User findMember(String userId);
}
