package com.example.springtemplate.controller;


import com.example.springtemplate.entity.Emp;
import com.example.springtemplate.entity.User;
import com.example.springtemplate.service.EmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author CarryBoy
 */
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "Mysql测试之员工信息管理API")
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @ApiOperation(value = "查找所有员工")
    @GetMapping("/getAllEmp")
    public List<Emp> getAllEmp(){
        return empService.findAllEmp();
    }


    @ApiOperation(value = "分页查找所有员工")
    @GetMapping("/getAllEmpByPage")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "pageIndex",required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "pageSize",required = true, dataType = "Integer")
    })
    public List<Emp> getAllEmpByPage(Integer pageIndex,Integer pageSize){
        return empService.findAllEmpByPage(pageIndex,pageSize);
    }

    @ApiOperation(value = "根据id查找员工")
    @ApiImplicitParam(name = "id", value = "员工id",required = true, dataType = "String")
    @GetMapping("/getById")
    public Emp getEmpById(String id){
        return empService.findById(id);
    }

    @ApiOperation(value = "根据id更新员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id",required = true, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "name",required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "age",required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "email", value = "email",required = true, dataType = "String")
    })
    @PostMapping("/updateById")
    public Integer UpdateById(String id,String name,Integer age,String email){
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName(name);
        emp.setAge(age);
        emp.setEmail(email);
        return empService.updateById(emp);
    }

    @ApiOperation(value = "新增员工")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "name",required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "age",required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "email", value = "email",required = true, dataType = "String")
    })
    @PostMapping("/addEmp")
    public Integer addEmp(String name,Integer age,String email){
        Emp emp = new Emp();
        emp.setId(UUID.randomUUID().toString());
        emp.setName(name);
        emp.setAge(age);
        emp.setEmail(email);
        return empService.addEmp(emp);
    }
    @ApiOperation(value = "根据id删除员工")
    @ApiImplicitParam(name = "id", value = "员工id",required = true, dataType = "String")
    @PostMapping("/deleteById")
    public Integer deleteById(String id){
        return empService.deleteById(id);
    }


}
