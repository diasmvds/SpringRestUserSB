package com.ds.spring.control;

import com.ds.spring.model.User;
import com.ds.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by darshanad on 5/9/2016.
 */
@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @RequestMapping( "/hello" )
    public String index()
    {
        return "Hello Spring Boot...";
    }

    @RequestMapping( path = "/users", method = RequestMethod.GET )
    public ResponseEntity<List<User>> getAllUsers()
    {
        return new ResponseEntity<List<User>>( userService.getAllUsers(), HttpStatus.OK );
    }
}
