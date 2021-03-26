package com.zh.core.bean;

public class DefaultBeanDefinition implements BeanDefinition {
    private String[] dependsOn;
    private String initMethodName;
    private String destroyMethodName;
    private String description;
    private String beanClassName;

    @Override
    public void setDependsOn(String... dependsOn) {
        this.dependsOn = dependsOn;
    }

    @Override
    public String[] getDependsOn() {
        if (dependsOn == null) {
            return dependsOn;
        }
        return new String[0];
    }

    @Override
    public void setInitMethodName(String initMethodName) {
        this.initMethodName=initMethodName;
    }

    @Override
    public String getInitMethodName() {
        return initMethodName;
    }

    @Override
    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }

    @Override
    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName ;
    }

    @Override
    public String getBeanClassName() {
        return beanClassName;
    }
}
