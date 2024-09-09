package com.spring.source.code.aop.aspectAnnotion;

import com.spring.source.code.aop.aspectAnnotion.service.ICommonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class aopAspectTest {

    /**
     *  基于注解+ xml式的开发
     */
    @Test
    public void aopTest() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop_annotation.xml");
        ICommonService commonService = context.getBean("commonServiceImpl", ICommonService.class);
        commonService.createCommon("我是一颗小石头");
    }


    /**
     *  完全基于注解式的开发
     */
    @Test
    public void aopTest2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAspectConfig.class);
        ICommonService commonService = context.getBean("commonServiceImpl", ICommonService.class);
        commonService.createCommon("我是一颗小石头");
    }

    /**
     *  完全基于xml
     */
    @Test
    public void aopTest3() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop_annotation.xml");
        ICommonService commonService = context.getBean("commonServiceImpl", ICommonService.class);
        commonService.createCommon("我是一颗小石头");
    }

}
