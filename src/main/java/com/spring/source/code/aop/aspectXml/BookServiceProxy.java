package com.spring.source.code.aop.aspectXml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

public class BookServiceProxy {


    /**
     * 这里是抽出一个公共的，供下面的方法使用
     */
    public void before() {
        System.out.println("before我是前置通知啊........");
    }

    private void around(ProceedingJoinPoint joinPoint) {
        System.out.println("around我是环绕通知前啊");

        try {
            Object proceed = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around我是环绕通知后啊");
    }

    public void after() {
        System.out.println("after我是后置通知啊.....");
    }

    public void afterThrowing() {
        System.out.println("AfterThrowing我是异常回调通知");
    }

    public void afterReturning() {

        System.out.println("afterReturning我是返回结果后执行...");
    }


}
