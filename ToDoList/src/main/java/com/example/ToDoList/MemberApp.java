package com.example.ToDoList;

import com.example.ToDoList.user.vo.User;
import com.example.ToDoList.user.dao.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class MemberApp {

    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);

        User user = new User("10001","0824","nicednjsdud@naver.com","정원영",new Date());
        userService.join(user);

        User findUser = userService.findUser("10001");
        System.out.println("new user = "+user.getUserName());
        System.out.println("find user = "+findUser.getUserName());
    }
}
