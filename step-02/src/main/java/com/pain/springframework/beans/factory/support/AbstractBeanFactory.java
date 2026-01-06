package com.pain.springframework.beans.factory.support;

import com.pain.springframework.beans.BeansException;
import com.pain.springframework.beans.factory.BeanFactory;
import com.pain.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract  BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
