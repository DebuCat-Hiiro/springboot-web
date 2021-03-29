package com.lxf.springbootweb.service;

import com.lxf.springbootweb.pojo.User;

/**
 * @author Hanamaru
 */
public interface UserService {
    /**
     * 根据id查询用户信息
     * @param uid
     * @return user
     */
    User queryUserbyId(int uid);
}
