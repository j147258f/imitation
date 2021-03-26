package com.zh.core.bean;

//由于原spring中beanFactory代码巨大且功能太多  这里只做精简版
public class DefaultBeanFactory implements BeanFactory {


    @Override
    public Object getBean(String name) {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> requiredType, Object... args) {
        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    public <T> T createBean(Class<T> beanClass) {
        return null;
    }

    @Override
    public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) {
        //todo
        return null;
    }

    @Override
    public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) {
        //todo
        return null;
    }

    //spring中bean由于功能强大，创建过程复杂，这里只精简核心功能
    private Object doCreateBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object o;

        //一系列检查

        //前置处理器

        //后置处理器

        //反射创建
        try {
            o = Class.forName(beanDefinition.getBeanClassName()).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("error when create bean", e);
        }

        //todo  bean中的依赖未处理


        return o;
    }
}
