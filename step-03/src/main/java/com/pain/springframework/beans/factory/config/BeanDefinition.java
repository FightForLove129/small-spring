package com.pain.springframework.beans.factory.config;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

}
