package com.spring.source.code.beanLifecycle;

import com.spring.source.code.beanLifecycle.entities.BeanLifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class BeanLifecycleTest {


    /**
     * bean的生命周期有以下几个步骤：
     * 第1步骤-----执行构造方法
     * 第2步步骤-----设置属性
     * 第3.1步骤------我是初始化前。。。。。。。beanLife
     * 第3步步骤------执行初始化方法
     * 第3.2步骤------我是初始化后。。。。。。beanLife
     * 第4步骤---- bean构建完成，调用bean的相关属性和方法
     * 第5步骤------释放bean
     * <p>
     * BeanPostProcessor 后置处理器是针对全局的。
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_lifecycle_test.xml");
        BeanLifecycle beanLife = context.getBean("beanLife", BeanLifecycle.class);
        beanLife.execute();
        context.close();
    }
}
