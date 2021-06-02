package com.gstu.server.service;

import com.gstu.server.dao.UserDAO;
import com.gstu.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public List<User> getUsers(){
        return userDAO.getUsers();
    }
}