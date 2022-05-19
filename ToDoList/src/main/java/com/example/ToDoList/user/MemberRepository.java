package com.example.ToDoList.user;

public interface MemberRepository {

    void save(User user);

    User findById(String userId);
}
