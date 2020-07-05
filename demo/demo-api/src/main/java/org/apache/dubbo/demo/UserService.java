package org.apache.dubbo.demo;

import org.apache.dubbo.demo.dataobject.UserDO;

/**
 * 用户服务
 *
 * author: sin
 * time: 2020/7/5 10:21 下午
 */
public interface UserService {

    UserDO getUser(String username);
}
