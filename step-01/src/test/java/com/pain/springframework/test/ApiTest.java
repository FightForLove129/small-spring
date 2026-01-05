package com.pain.springframework.test;

import com.pain.springframework.BeanDefinition;
import com.pain.springframework.BeanFactory;
import com.pain.springframework.bean.UserService;
import org.junit.Test;

/**
 * @Author：fyt
 * @Date: 2026/1/5
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        //1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        //2.注册 bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(new UserService()));
        //3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
