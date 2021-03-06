package com.zh.core.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Configuration {

    String value() default "";

    boolean proxyBeanMethods() default true;
}