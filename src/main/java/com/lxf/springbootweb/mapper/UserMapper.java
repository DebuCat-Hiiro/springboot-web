package com.lxf.springbootweb.mapper;

import com.lxf.springbootweb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Hanamaru
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param uid
     * @return user
     */
    User queryUserbyId(int uid);
}
