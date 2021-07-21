package com.example.springtemplate.service.Impl;

import com.example.springtemplate.entity.User;
import com.example.springtemplate.mapper.UserMapper;
import com.example.springtemplate.service.UserService;
import com.example.springtemplate.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author CarryBoy
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public Boolean addUser(UserVo user) {
        return userMapper.addUser(user);
    }

    @Override
    public Boolean deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
