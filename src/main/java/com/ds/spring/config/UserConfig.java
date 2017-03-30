package com.ds.spring.config;

import com.ds.spring.control.UserController;
import com.ds.spring.service.UserService;
import com.ds.spring.service.UserServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by darshanad on 4/28/2016.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ds.spring")
public class UserConfig
{
    @Bean
    public UserService userService()
    {
        return  new UserServiceImpl();
    }
}
