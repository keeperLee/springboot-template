package com.example.springtemplate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springtemplate.entity.User;
import com.example.springtemplate.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     *
     * @return
     */
     List<User> findAllUser();

    /**
     *
     * @return
     */
     User findUserById(@Param("id") Integer id);

    /**
     *
     * @return
     */
     Boolean addUser(UserVo user);

    /**
     *
     * @return
     */
     Boolean deleteUserById(@Param("id") Integer id);

}
