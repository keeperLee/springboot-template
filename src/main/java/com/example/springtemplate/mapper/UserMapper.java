package com.example.springtemplate.mapper;

import com.example.springtemplate.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     *
     * @return
     */
    public List<User> findAllUser();

    /**
     *
     * @return
     */
    public User findUserById(@Param("id") Integer id);
}
