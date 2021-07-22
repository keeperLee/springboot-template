package com.example.springtemplate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springtemplate.entity.Emp;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMapper extends BaseMapper<Emp> {
}
