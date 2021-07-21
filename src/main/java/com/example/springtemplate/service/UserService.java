package com.example.springtemplate.service;

import com.example.springtemplate.entity.User;
import com.example.springtemplate.vo.UserVo;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {

    List<User> findAllUser();
    User findUserById(Integer id);
    Boolean addUser(UserVo user);
    Boolean deleteUserById(Integer id);

}
