package com.ds.spring.service;

import com.ds.spring.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by darshanad on 4/28/2016.
 */
public class UserServiceImpl implements UserService
{
    private List<User> userList = new ArrayList<User>();

    public UserServiceImpl()
    {
        User user1 = new User( 1, "Mark" );
        user1.setAge( 25 );
        user1.setJoinedOn( new Date(2015, 4, 1 ) );
        userList.add( user1 );

        User user2 = new User( 2, "David" );
        user2.setAge( 27 );
        user2.setJoinedOn( new Date(2016, 4, 1 ) );
        userList.add( user2 );
    }

    public User findUserById( long id )
    {
        for ( User user : userList )
        {
            if ( user.getId() == id )
            {
                return user;
            }
        }
        return null;
    }

    public User findUserByName( String name )
    {
        for ( User user : userList )
        {
            if ( user.getName().equals( name ) )
            {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers()
    {
        return userList;
    }

    @Override public String addUser( User user )
    {
        if ( user == null )
        {
            return "Empty User Details";
        }

        user.setId( userList.size() + 1 );
        userList.add( user );

        return "Successfully Added";
    }

    @Override public User updateUser( long id, User user )
    {
        User existing = findUserById( id );
        if ( existing != null )
        {
            existing.setName( user.getName() );
            existing.setAge( user.getAge() );
            existing.setJoinedOn( user.getJoinedOn() );

            return existing;
        }
        return null;
    }

    @Override public String deleteUser( long id )
    {
        User user = findUserById( id );
        if ( user != null )
        {
            userList.remove( user );
            return "Successfully Deleted...";
        }
        else
        {
            return "No such user found";
        }
    }
}
