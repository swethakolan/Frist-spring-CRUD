package com.example;

import com.example.configuration.AppConfig;
import com.example.controller.UserController;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        UserController userController=context.getBean(UserController.class);
        userController.createUser("Swetha");
        userController.listUsers();
    }
}
