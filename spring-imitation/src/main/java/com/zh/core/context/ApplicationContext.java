package com.zh.core.context;

public interface ApplicationContext extends Lifecycle, Environment {

    String name();

    ApplicationContext parent();

    void refresh();
}
