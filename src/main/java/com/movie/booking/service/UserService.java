package com.movie.booking.service;

import com.movie.booking.dao.UserDao;
import com.movie.booking.model.User;

import java.util.List;

public class UserService {

    private UserDao userDao = new UserDao();

    public boolean createUser(User user) {
        return userDao.createUser(user);
    }

    public  boolean deleteUser(String mobileNumber) {
        return userDao.deleteUser(mobileNumber);
    }

    public User getUser(String mobileNumber) {
        return userDao.getUser(mobileNumber);
    }

    public List<User> getAll(){
        return userDao.getAll();
    }
}
