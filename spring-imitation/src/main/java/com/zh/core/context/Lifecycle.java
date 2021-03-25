package com.zh.core.context;

public interface Lifecycle {
    void start();

    void stop();

    boolean isRunning();
}