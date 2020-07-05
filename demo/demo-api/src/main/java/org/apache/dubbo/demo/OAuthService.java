package org.apache.dubbo.demo;

import org.apache.dubbo.demo.dataobject.UserDO;

/**
 * oauth2
 *
 * author: sin
 * time: 2020/7/5 10:31 下午
 */
public interface OAuthService {

    UserDO login(String username, String password);
}
