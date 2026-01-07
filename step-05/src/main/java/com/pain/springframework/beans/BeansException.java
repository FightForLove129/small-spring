package com.pain.springframework.beans;

/**
 * @Author：tdpain
 * @Date: 2026/1/6
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
