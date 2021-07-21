package com.example.springtemplate.controller;


import com.example.springtemplate.entity.User;
import com.example.springtemplate.service.UserService;
import com.example.springtemplate.util.RedisUtil;
import com.example.springtemplate.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author CarryBoy
 */
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "Redis之用户信息管理API")
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private final static Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private RedisUtil redisUtil;

    @ApiOperation(value = "判断key值是否存在")
    @ApiImplicitParam(name = "key", value = "键",required = true, dataType = "String")
    @GetMapping("/hasKey")
    public Boolean hasKey(String key){
        return redisUtil.hasKey(key);
    }

    @ApiOperation(value = "设置值")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "键",required = true, dataType = "String"),
            @ApiImplicitParam(name = "value", value = "值",required = true, dataType = "String")
    })
    @GetMapping("/setValue")
    public Boolean setValue(String key , String value){
        return redisUtil.set(key,value);
    }

    @ApiOperation(value = "获取值")
    @ApiImplicitParam(name = "key", value = "键",required = true, dataType = "String")
    @GetMapping("/getValue")
    public Object getValue(String key){
        logger.info("key:"+key);
        return redisUtil.get(key).toString();
    }
}
