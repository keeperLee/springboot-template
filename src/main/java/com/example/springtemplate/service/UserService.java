package com.example.springtemplate.service;

import com.example.springtemplate.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {

   public List<User> findAllUser();
   public User findUserById(Integer id);

}
