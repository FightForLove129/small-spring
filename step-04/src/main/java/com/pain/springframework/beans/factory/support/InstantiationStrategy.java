package com.pain.springframework.beans.factory.support;

import com.pain.springframework.beans.BeansException;
import com.pain.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
