package com.pain.springframework.beans.factory;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class PropertyValue {

    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
