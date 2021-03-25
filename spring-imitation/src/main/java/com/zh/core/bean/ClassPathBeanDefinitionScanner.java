package com.zh.core.bean;

public class ClassPathBeanDefinitionScanner {
    private final BeanDefinitionRegistry registry;

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        this.registry = registry;

        //todo 设置ResourceLoader
    }

    public int scan(String... basePackages) {
        //todo

        return 1;
    }

    //todo
}
