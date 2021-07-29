package com.example.springtemplate.controller;


import com.example.springtemplate.entity.User;
import com.example.springtemplate.service.UserService;
import com.example.springtemplate.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author CarryBoy
 */
@CrossOrigin
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "Mysql测试之用户信息管理API")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${lijian.address}")
    private String address;

    @ApiOperation(value = "查找所有用户")
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        System.out.println(address);
        return userService.findAllUser();
    }

    @ApiIgnore
    @GetMapping("/sayHello")
    public String SayHello(){
        return "good boy,hello!";
    }

    @ApiOperation(value = "根据id查找用户")
    @ApiImplicitParam(name = "id", value = "用户id",required = true, dataType = "Integer")
    @GetMapping("/getUserById")
    public User getUserById(Integer id){
        return userService.findUserById(id);
    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/addUser")
    public Boolean addUser(@RequestBody UserVo user){
        return userService.addUser(user);
    }

    @ApiOperation(value = "删除用户")
    @PostMapping("/deleteUserById")
    @ApiImplicitParam(name = "id", value = "用户id",required = true, dataType = "Integer")
    public Boolean deleteUser(Integer id){
        return userService.deleteUserById(id);
    }
}
