package com.zh.core.annotation;

public @interface Autowired {

    //注入时 是否能输入null值
    boolean required() default false;

    //注入类型 0优先按类型注入 1优先按名称注入
    int injectType() default 0;
}
