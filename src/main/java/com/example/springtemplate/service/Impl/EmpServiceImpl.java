package com.example.springtemplate.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springtemplate.entity.Emp;
import com.example.springtemplate.mapper.EmpMapper;
import com.example.springtemplate.service.EmpService;
import com.example.springtemplate.vo.PaginationEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CarryBoy
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAllEmp() {
        return empMapper.selectList(null);
    }

    @Override
    public PaginationEmp findAllEmpByPage(Integer pageIndex, Integer pageSize) {
        IPage<Emp> empIPage = empMapper.selectPage(new Page<>(pageIndex, pageSize),null);
        PaginationEmp emp = new PaginationEmp();
        emp.setList(empIPage.getRecords());
        emp.setTotalSize(empIPage.getTotal());
        return emp;
    }

    @Override
    public Emp findById(String id) {
        return empMapper.selectById(id);
    }

    @Override
    public Integer addEmp(Emp emp) {
        return empMapper.insert(emp);
    }

    @Override
    public Integer deleteById(String id) {
        return empMapper.deleteById(id);
    }

    @Override
    public Integer updateById(Emp emp) {
        return empMapper.updateById(emp);
    }

}
