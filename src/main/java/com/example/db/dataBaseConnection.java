package com.example.db;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class dataBaseConnection {
    public List<String> users;
    public void init()
    {
        users = new ArrayList<>();
        System.out.println("db connected called init()");
    }

    public List<String> getUsers() {
        return users;
    }
    public void addUsers(String user)
    {

        users.add(user);
    }
    public void cleanUp()
    {
        System.out.println("db disconnected");
    }
}
