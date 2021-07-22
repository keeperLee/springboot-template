package com.example.springtemplate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springtemplate.entity.Emp;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMapper extends BaseMapper<Emp> {
}
