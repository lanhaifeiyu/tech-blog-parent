package com.lhfeiyu.tech.blog.service;

import com.lhfeiyu.tech.blog.mapper.UserMapper;
import com.lhfeiyu.tech.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Airson Yu
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User load(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void add(User user) {
        userMapper.insertSelective(user);
    }

    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

}
