package com.pain.springframework.beans.factory.support;

import com.pain.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
