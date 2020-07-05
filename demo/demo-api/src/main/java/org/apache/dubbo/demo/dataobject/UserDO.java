package org.apache.dubbo.demo.dataobject;

import java.io.Serializable;

/**
 * 用户信息
 *
 * author: sin
 * time: 2020/7/5 10:32 下午
 */
public class UserDO implements Serializable {

    private String username;

    private String password;

    private Integer age;

    public String getUsername() {
        return username;
    }

    public UserDO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDO setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserDO setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
