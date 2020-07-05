package org.apache.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 提供者
 *
 * author: sin
 * time: 2020/7/5 10:39 下午
 */
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("provider-config.xml");
        applicationContext.start();
        System.in.read();
    }
}
