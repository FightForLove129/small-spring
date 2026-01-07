package com.pain.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author：tdpain
 * @Date: 2026/1/7
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
