package com.zh.core.bean;

public class AnnotatedBeanDefinitionReader {
    private final BeanDefinitionRegistry registry;

    public AnnotatedBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this.registry = registry;

        //todo 注册后置处理器 （不知道是bean工厂or bean or beanDefinition）
    }

    //todo registeBeans
}
