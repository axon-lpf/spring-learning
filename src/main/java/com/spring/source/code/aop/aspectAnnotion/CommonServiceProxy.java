package com.spring.source.code.aop.aspectAnnotion;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CommonServiceProxy {


    /**
     *  这里是抽出一个公共的，供下面的方法使用
     */
   // @Pointcut("execution(* com.spring.source.code.aop.aspectAnnotion.service.impl.CommonServiceImpl.*(..))")

    @Pointcut("execution(* com.spring.source.code.aop.aspectAnnotion.service.impl.CommonServiceImpl.createCommon(..))")
    public void  Pointcut(){

    }

    @Before("Pointcut()")
    public void  before(){
        System.out.println("before我是前置通知啊........");
    }

    @Around("Pointcut()")
    private void  around(ProceedingJoinPoint joinPoint){
        System.out.println("around我是环绕通知前啊");

        try {
            Object proceed = joinPoint.proceed();
            System.out.println(proceed.toString());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around我是环绕通知后啊");
    }

    @After("Pointcut()")
    public void after(){
        System.out.println("after我是后置通知啊.....");
    }

    @AfterThrowing(value = "Pointcut()",throwing = "ex")
    public  void afterThrowing(){
        System.out.println("AfterThrowing我是异常回调通知");
    }

    @AfterReturning("Pointcut()")
    public void afterReturning(){

        System.out.println("afterReturning我是返回结果后执行...");
    }









}
