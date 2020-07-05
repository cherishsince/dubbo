package org.apache.dubbo.demo;

import org.apache.dubbo.demo.dataobject.UserDO;

/**
 * 认证 service
 *
 * author: sin
 * time: 2020/7/5 10:32 下午
 */
public class OAuthServiceImpl implements OAuthService {

    private UserService userService;

    @Override
    public UserDO login(String username, String password) {
        return userService.getUser(username);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
