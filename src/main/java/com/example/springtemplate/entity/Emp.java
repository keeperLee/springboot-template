package com.example.springtemplate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Emp {
    @TableId(value = "id",type = IdType.INPUT)
    private String id;
    private String name;
    private Integer age;
    private String email;

}
