package com.spring.source.code.beanScope;

import com.spring.source.code.beanScope.entities.BeanScope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class BeanScopeTest {

    /**
     *  bean的作用域
     */
    @Test
    public void test(){

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean_scope_test.xml");
        BeanScope beanScopeSingleton = context.getBean("beanScopeSingleton", BeanScope.class);
        System.out.println(beanScopeSingleton.hashCode());
         beanScopeSingleton = context.getBean("beanScopeSingleton", BeanScope.class);
        System.out.println(beanScopeSingleton.hashCode());

        BeanScope beanScopePrototype = context.getBean("beanScopePrototype", BeanScope.class);
        System.out.println(beanScopePrototype.hashCode());
         beanScopePrototype = context.getBean("beanScopePrototype", BeanScope.class);
        System.out.println(beanScopePrototype.hashCode());



    }
}
