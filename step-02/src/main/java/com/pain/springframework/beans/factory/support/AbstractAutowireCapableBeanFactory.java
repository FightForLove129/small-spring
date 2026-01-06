package com.pain.springframework.beans.factory.support;

import com.pain.springframework.beans.BeansException;
import com.pain.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
