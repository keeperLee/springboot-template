package com.example.springtemplate.controller;


import com.example.springtemplate.entity.Emp;
import com.example.springtemplate.service.EmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * @author CarryBoy
 */
@CrossOrigin
@Api(value = "@Api：用在控制器类上，表示对类的说明", tags = "上传文件")
@RestController
@RequestMapping("/upload")
public class UploadController {

    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @ApiOperation(value = "上传文件")
    @ApiImplicitParam(name = "multipartFile", value = "文件",required = true,dataType = "file",paramType = "form")
    @PostMapping(value = "/upload")
    public String handleFileUpload(@RequestParam("multipartFile") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                /*
                 * 这段代码执行完毕之后，图片上传到了工程的跟路径； 大家自己扩散下思维，如果我们想把图片上传到
                 * d:/files大家是否能实现呢？ 等等;
                 * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如： 1、文件路径； 2、文件名；
                 * 3、文件格式; 4、文件大小的限制;
                 */
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("D:\\vueUploadFile\\" +file.getOriginalFilename())));
                System.out.println(file.getName());
                out.write( file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }

            return "上传成功";

        } else {
            return "上传失败，因为文件是空的.";
        }
    }
}
