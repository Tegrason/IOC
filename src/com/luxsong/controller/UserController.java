package com.luxsong.controller;

import com.luxsong.service.UserService;
import com.luxsong.entity.User;
import com.luxsong.ioc.Component;
import com.luxsong.ioc.Inject;

@Component
public class UserController {
    @Inject
    private UserService userService;
    public void helloUsers(){
        User user = userService.getUser();
        System.out.println(user.getName()+""+user.getAge());
    }
}
