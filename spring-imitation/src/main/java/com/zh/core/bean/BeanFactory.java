package com.zh.core.bean;

//不像spring对接口做过细的区分
public interface BeanFactory {
    Object getBean(String name);

    <T> T getBean(String name, Class<T> requiredType);

    <T> T getBean(Class<T> requiredType, Object... args);

    boolean containsBean(String name);

    <T> T createBean(Class<T> beanClass);

    public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName);

    public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName);
}
