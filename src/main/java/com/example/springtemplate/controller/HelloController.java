package com.example.springtemplate.controller;


import com.example.springtemplate.entity.User;
import com.example.springtemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CarryBoy
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,path = "/getAllUser")
    public List<User> getAllUser(){
        return userService.findAllUser();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,path = "/sayhello")
    public String SayHello(){
        return "good boy,hello!";
    }
}
