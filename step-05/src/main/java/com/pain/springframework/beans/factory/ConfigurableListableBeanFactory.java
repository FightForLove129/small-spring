package com.pain.springframework.beans.factory;

import com.pain.springframework.beans.BeansException;
import com.pain.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.pain.springframework.beans.factory.config.BeanDefinition;
import com.pain.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author：tdpain
 * @Date: 2026/1/8
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
