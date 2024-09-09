package com.spring.source.code.beanLifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 后置处理器
 */
public class MyPostProcessor implements BeanPostProcessor {

    /**
     * 初始化前执行
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第3.1步骤------我是初始化前。。。。。。。" + beanName);
        return bean;
    }

    /**
     * 初始后执行
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第3.2步骤------我是初始化后。。。。。。"+beanName);
        return bean;
    }
}
