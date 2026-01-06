package com.pain.springframework.beans.factory.config;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
