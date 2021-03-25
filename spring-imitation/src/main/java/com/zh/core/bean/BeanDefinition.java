package com.zh.core.bean;

public interface BeanDefinition {
    void setDependsOn(String... dependsOn);

    String[] getDependsOn();

    void setInitMethodName(String initMethodName);

    String getInitMethodName();

    void setDestroyMethodName(String destroyMethodName);

    String getDestroyMethodName();

    void setDescription(String description);

    String getDescription();
}
