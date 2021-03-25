package com.zh.core.context;

import com.zh.core.bean.AnnotatedBeanDefinitionReader;
import com.zh.core.bean.ClassPathBeanDefinitionScanner;

public class AnnotationConfigApplicationContext extends AbstractApplicationContext {

    private final AnnotatedBeanDefinitionReader reader;

    private final ClassPathBeanDefinitionScanner scanner;

    public AnnotationConfigApplicationContext() {
        reader = new AnnotatedBeanDefinitionReader(this);
        scanner = new ClassPathBeanDefinitionScanner(this);
    }


}
