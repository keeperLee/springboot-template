package com.example.springtemplate.service;

import com.example.springtemplate.entity.Emp;
import com.example.springtemplate.vo.PaginationEmp;

import java.util.List;

public interface EmpService {
    List<Emp> findAllEmp();
    PaginationEmp findAllEmpByPage(Integer pageIndex, Integer pageSize);
    Emp findById(String id);
    Integer addEmp(Emp emp);
    Integer deleteById(String id);
    Integer updateById(Emp emp);
}
