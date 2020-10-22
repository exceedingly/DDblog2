package com.mcd.controller;

import com.mcd.model.User;
import com.mcd.service.impl.UserMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class addUserController {
    @Autowired
    UserMapperServiceImpl userMapperService;

    @GetMapping("/")
    @ResponseBody
    public User index() {
//        User user = new User();
//        user.setId(21);
//        user.setUsername("zs");
//        user.setPassword("zd");
//
//        userMapperService.addUser(user);
        return userMapperService.selUserById(3);
    }


}
