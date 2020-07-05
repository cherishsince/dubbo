package org.apache.dubbo.demo.impl;

import org.apache.dubbo.demo.UserService;
import org.apache.dubbo.demo.dataobject.UserDO;

/**
 * 用户 service
 *
 * author: sin
 * time: 2020/7/5 10:25 下午
 */
public class UserServiceImpl implements UserService {

    @Override
    public UserDO getUser(String username) {
        UserDO userDO = new UserDO();
        userDO.setAge(23);
        userDO.setUsername("admin");
        userDO.setPassword("as123");
        return userDO;
    }
}
