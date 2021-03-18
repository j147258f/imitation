package com.zh.core.resource;

import java.io.InputStream;

public interface ResourceReader {
    InputStream getInputStream();

    boolean exist();
}
