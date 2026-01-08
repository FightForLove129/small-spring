package com.pain.springframework.beans.factory.support;

import com.pain.springframework.beans.BeansException;
import com.pain.springframework.core.io.Resource;
import com.pain.springframework.core.io.ResourceLoader;

/**
 * @Author：tdpain
 * @Date: 2026/1/8
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
