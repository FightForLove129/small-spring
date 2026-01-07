package com.pain.springframework.beans.factory.config;

import com.pain.springframework.beans.PropertyValues;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public class BeanDefinition {

    private Class beanClass;

    /**
     * 属性信息
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

}
