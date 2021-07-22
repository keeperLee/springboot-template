package com.example.springtemplate.controller;


import com.example.springtemplate.entity.Emp;
import com.example.springtemplate.entity.User;
import com.example.springtemplate.service.EmpService;
import com.example.springtemplate.service.UserService;
import com.example.springtemplate.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author CarryBoy
 */
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "Mysql测试之员工信息管理API")
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @ApiOperation(value = "查找所有用户")
    @GetMapping("/getAllEmp")
    public List<Emp> getAllEmp(){
        return empService.findAllEmp();
    }



}
