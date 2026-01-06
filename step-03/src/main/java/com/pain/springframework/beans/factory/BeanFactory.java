package com.pain.springframework.beans.factory;

import com.pain.springframework.beans.BeansException;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
