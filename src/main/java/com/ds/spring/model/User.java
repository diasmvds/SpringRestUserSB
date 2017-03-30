package com.ds.spring.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by darshanad on 4/28/2016.
 */
public class User
{
    private long id;
    private String name;
    private int age;
    private Date joinedOn;

    public User()
    {

    }

    public User( long id, String name )
    {
        this.id = id;
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public void setId( long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    public Date getJoinedOn()
    {
        return joinedOn;
    }

    public void setJoinedOn( Date joinedOn )
    {
        this.joinedOn = joinedOn;
    }
}
