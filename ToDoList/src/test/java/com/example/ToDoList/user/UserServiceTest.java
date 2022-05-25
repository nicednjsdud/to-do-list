package com.example.ToDoList.user;

import com.example.ToDoList.repository.MemoryUserRepository;
import com.example.ToDoList.user.vo.User;
import com.example.ToDoList.user.dao.UserService;
import com.example.ToDoList.user.dao.UserServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class UserServiceTest {
    UserService userService = new UserServiceImpl(new MemoryUserRepository());

    @Test
    void join(){

        User user = new User("10001","0824","nicednjsdud@naver.com","정원영",new Date());

        userService.join(user);
        User findUser = userService.findUser("10001");

        Assertions.assertThat(user).isEqualTo(findUser);

    }
}
