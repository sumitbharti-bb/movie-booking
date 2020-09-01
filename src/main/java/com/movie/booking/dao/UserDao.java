package com.movie.booking.dao;

import com.movie.booking.model.Booking;
import com.movie.booking.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private List<User> users = new ArrayList<User>();

    public boolean createUser(User user) {
        return users.add(user);
    }

    public  boolean deleteUser(String mobileNumber) {
        for(User user : users) {
            if(user.getMobileNumber().equals(mobileNumber)) {
                return users.remove(user);
            }
        }
        return true;
    }

    public User getUser(String mobileNumber) {
        for(User user : users) {
            if(user.getMobileNumber().equals(mobileNumber)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAll(){
        return users;
    }
}
