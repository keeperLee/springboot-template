package com.example.springtemplate.vo;

import com.example.springtemplate.entity.Emp;
import lombok.Data;

import java.util.List;

/**
 * @author CarryBoy
 * @date 2021/7/30 15:20
 * @description
 */
@Data
public class PaginationEmp {
    private List<Emp> list;
    private Long totalSize;

}
