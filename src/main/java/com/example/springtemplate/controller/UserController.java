package com.example.springtemplate.controller;


import com.example.springtemplate.entity.User;
import com.example.springtemplate.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author CarryBoy
 */
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "Swagger测试之用户信息管理API")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查找所有用户")
    @RequestMapping(method = RequestMethod.GET,path = "/getAllUser")
    public List<User> getAllUser(){
        return userService.findAllUser();
    }

    @ApiIgnore
    @RequestMapping(method = RequestMethod.GET,path = "/sayhello")
    public String SayHello(){
        return "good boy,hello!";
    }

    @RequestMapping(method = RequestMethod.POST,path = "getUserById"  )
    @ApiOperation(value = "根据id查找用户")
    @ApiImplicitParam(name = "id", value = "用户id",required = true, dataType = "Integer")
    public User getUserById(Integer id){
        return userService.findUserById(id);
    }
}
