package com.spring.source.code.aop.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ShopServiceProxy implements InvocationHandler {

    private Object object;

    public ShopServiceProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前执行
        System.out.println("我是方法之前，方法名称" + method.getName());
        int invoke = (int) method.invoke(object, args);
        // 方法之后执行
        System.out.println("我是方法之后执行,输出结果" + invoke);
        return invoke + 10;
    }
}
