package com.example.springtemplate.controller;


import com.example.springtemplate.websocket.WebSocketServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @author CarryBoy
 */
@CrossOrigin
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "测试websocket推送")
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private WebSocketServer webSocketServer;

    /**
     * 广播发送信息;
     *
     * @param text
     * @return
     */
    @ApiOperation(value = "发送广播")
    @ApiImplicitParam(name = "text", value = "广播内容",required = true)
    @GetMapping(value = "/say")
    public void Broadcast(String text) {
      webSocketServer.sendInfo(text);
    }
}
