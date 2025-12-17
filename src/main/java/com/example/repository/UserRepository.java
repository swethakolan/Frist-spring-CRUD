package com.example.repository;

import com.example.db.dataBaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private dataBaseConnection db;

    public UserRepository(dataBaseConnection db) {
        this.db = db;
    }
    public List<String> findAll()
    {
        return db.getUsers();
    }
    public void save(String user)
    {
        db.addUsers(user);
    }
}
