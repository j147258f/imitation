package com.zh.core.context;

import com.zh.core.bean.BeanDefinition;
import com.zh.core.bean.BeanDefinitionRegistry;
import com.zh.core.bean.BeanFactory;

import java.util.List;

public abstract class AbstractApplicationContext implements ApplicationContext, BeanDefinitionRegistry {

    //protected 事件监听list

    //protected 事件list

    @Override
    public String name() {
        return null;
    }

    @Override
    public ApplicationContext parent() {
        return null;
    }

    @Override
    public void refresh() {
        //核心功能
        /*
        prepareRefresh();

			// Tell the subclass to refresh the internal bean factory.
			ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();

			// Prepare the bean factory for use in this context.
			prepareBeanFactory(beanFactory);

			try {
				// Allows post-processing of the bean factory in context subclasses.
				postProcessBeanFactory(beanFactory);

				// Invoke factory processors registered as beans in the context.
				invokeBeanFactoryPostProcessors(beanFactory);

				// Register bean processors that intercept bean creation.
				registerBeanPostProcessors(beanFactory);

				// Initialize message source for this context.
				initMessageSource();

				// Initialize event multicaster for this context.
				initApplicationEventMulticaster();

				// Initialize other special beans in specific context subclasses.
				onRefresh();

				// Check for listener beans and register them.
				registerListeners();

				// Instantiate all remaining (non-lazy-init) singletons.
				finishBeanFactoryInitialization(beanFactory);

				// Last step: publish corresponding event.
				finishRefresh();
			}
        */
    }

    private void prepareRefresh(){
        //initPropertySources

        //初始化监听器list

        //初始化事件list
    }

    protected BeanFactory obtainFreshBeanFactory(){
        //确认并发

        //返回默认的BeanFactory

        //todo beanFactory class
        return null;
    }

    protected void prepareBeanFactory(BeanFactory beanFactory){
        //由于很多内置组件也是bean  因此要手动设置：忽略依赖   手动设置bean之前的依赖   注册BeanPostProcessor


    }

    @Override
    public String[] getActiveProfiles() {
        return new String[0];
    }

    @Override
    public String[] getDefaultProfiles() {
        return new String[0];
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {

    }

    @Override
    public void removeBeanDefinition(String beanName) {

    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        return null;
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return false;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return new String[0];
    }

    @Override
    public int getBeanDefinitionCount() {
        return 0;
    }
}
