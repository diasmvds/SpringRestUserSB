package com.ds.spring.service;

import com.ds.spring.model.User;

import java.util.List;

/**
 * Created by darshanad on 4/28/2016.
 */
public interface UserService
{
    public User findUserById( long id );

    public User findUserByName( String name );

    public List<User> getAllUsers();

    public String addUser( User user );

    User updateUser( long id, User user );

    String deleteUser( long id );
}
