package com.spring.source.code.factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean<T> implements FactoryBean<T> {
    private Class<T> interfaceType;
    private T target;

    public ProxyFactoryBean(Class<T> interfaceType, T target) {
        this.interfaceType = interfaceType;
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class[]{interfaceType},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before method: " + method.getName());
                        Object result = method.invoke(target, args);
                        System.out.println("After method: " + method.getName());
                        return result;
                    }
                });
    }

    @Override
    public Class<?> getObjectType() {
        return interfaceType;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}