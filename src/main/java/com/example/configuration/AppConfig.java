package com.example.configuration;

import com.example.db.dataBaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
@Configuration
@ComponentScan("com.example")
public class AppConfig {
    @Bean(initMethod = "init",destroyMethod = "cleanUp")
    public dataBaseConnection dbConnection()
    {
        return new dataBaseConnection();
    }
}
