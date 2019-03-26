package com.luxsong.service;

import com.luxsong.entity.User;
import com.luxsong.ioc.Component;

@Component
public class UserService {
    public User getUser(){
        User user = new User("dog",12);
        return user;
    }
}
