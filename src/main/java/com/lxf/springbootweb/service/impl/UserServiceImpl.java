package com.lxf.springbootweb.service.impl;

import com.lxf.springbootweb.mapper.UserMapper;
import com.lxf.springbootweb.pojo.User;
import com.lxf.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Hanamaru
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUserbyId(int uid) {
        User user = userMapper.queryUserbyId(uid);
        return user;
    }
}
