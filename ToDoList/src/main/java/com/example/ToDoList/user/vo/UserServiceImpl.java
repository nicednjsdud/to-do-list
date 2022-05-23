package com.example.ToDoList.user.vo;

import com.example.ToDoList.user.UserRepository;
import com.example.ToDoList.user.dao.MemoryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository UserRepository) {
        this.userRepository= UserRepository;
    }


    @Override
    public void join(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUser(String userId) {
        return userRepository.findById(userId);
    }

    // 테스트 용도
}
