package com.spring.source.code.aop.base;

import com.spring.source.code.aop.base.service.IShopService;
import com.spring.source.code.aop.base.service.impl.ShopServiceImpl;

import java.lang.reflect.Proxy;

/**
 * jdk 动态代理处理， jdk是处理有接口的情况下的代理
 * <p>
 * 在java.lang.reflect.Prox 包下
 *
 */
public class JDKProxyTest {


    public static void main(String[] args) {

        //创建接口实现类代理对象
        Class[] interfaces = new Class[]{IShopService.class};
        IShopService shopService = new ShopServiceImpl();

        /**
         *  第一个参数：类加载器
         *  第二个参数：增强方法所在类，这个类实现的接口，支持多个接口
         *  第三个参数，实现这个接口
         */
        IShopService shopProxy = (IShopService) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(), interfaces, new ShopServiceProxy(shopService));

        Integer shopResult = shopProxy.createShop(10, 20);
        System.out.println("我是最终结果" + shopResult);
    }
}
