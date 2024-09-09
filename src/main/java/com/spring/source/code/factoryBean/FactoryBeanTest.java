package com.spring.source.code.factoryBean;

import com.spring.source.code.factoryBean.enitites.MyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 *  factory test
 */
public class FactoryBeanTest {


    /**
     * FactoryBean 在 Spring 框架中有很多实际使用场景，它用于创建复杂或自定义初始化逻辑的对象，尤其是在需要动态代理、池化对象、单例模式等场景时特别有用。以下是一个使用 FactoryBean 创建动态代理对象的实际案例。
     * 使用场景：动态代理对象的创建
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factory_bean_test.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean);
        myBean.test();

        myBean = (MyBean) context.getBean("myFactoryBean");
        System.out.println(myBean);
        myBean.test();

    }
}
