package com.example.springtemplate.mapper;

import com.example.springtemplate.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> findAllUser();
}
