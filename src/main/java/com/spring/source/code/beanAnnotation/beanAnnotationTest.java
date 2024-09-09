package com.spring.source.code.beanAnnotation;

import com.spring.source.code.beanAnnotation.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

/**
 * 基于注解的装载bean
 * <p>
 * 对象的处理
 *
 * @Controller :作用域controller层
 * @Service : 作用业务逻辑层
 * @Component : 一些组件类
 * @Repository ： 作用域数据库访问层
 * <p>
 * 属性的注入：
 * @Autowired：  于自动注入依赖的 Bean。Spring 根据类型自动匹配并注入 Bean，如果有多个 Bean 可能需要通过 @Qualifier 指定具体的 Bean。
 * @Qualifier： 用于在自动注入时指定注入的 Bean。如果有多个 Bean 类型匹配，可以使用 @Qualifier 来明确指定需要注入的 Bean。
 * @Resource ： 用于注入 Bean。它主要基于名称进行注入，可以指定 name 属性来指定要注入的 Bean 的名称。也可以根据类型来指定
 *
 * 总结
 *
 * 	•	Bean 装载注解 (@Controller, @Service, @Component, @Repository) 用于声明类作为 Spring 容器中的组件，并根据其作用域和职责进行分类。
 * 	•	属性注入注解 (@Autowired, @Qualifier, @Resource) 用于在 Bean 中自动注入依赖的对象，提供灵活的依赖管理方式。
 */

@Service
public class beanAnnotationTest {


    @Autowired
    private IOrderService orderService;

    /**
     * 这里是通过xml文件配置扫描路径的
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_annotation.xml");
        IOrderService orderService = (IOrderService) context.getBean("orderServiceImpl");
        orderService.queryOrder("");
    }

    @Test
    public void test2() {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringAnnotationConfig.class);
/*
        IOrderService orderService = (IOrderService) annotationConfigApplicationContext.getBean("orderServiceImpl");
*/
        // 从上下文中获取 BeanAnnotationTest 实例
        beanAnnotationTest beanAnnotationTest = annotationConfigApplicationContext.getBean(beanAnnotationTest.class);

        // 使用注入的 orderService
        beanAnnotationTest.orderService.queryOrder("");
    }
}
