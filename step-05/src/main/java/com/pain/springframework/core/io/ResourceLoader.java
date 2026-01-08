package com.pain.springframework.core.io;

/**
 * @Author：tdpain
 * @Date: 2026/1/8
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
