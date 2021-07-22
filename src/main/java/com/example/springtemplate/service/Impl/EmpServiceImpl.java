package com.example.springtemplate.service.Impl;

import com.example.springtemplate.entity.Emp;
import com.example.springtemplate.entity.User;
import com.example.springtemplate.mapper.EmpMapper;
import com.example.springtemplate.mapper.UserMapper;
import com.example.springtemplate.service.EmpService;
import com.example.springtemplate.service.UserService;
import com.example.springtemplate.vo.UserVo;
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

}
