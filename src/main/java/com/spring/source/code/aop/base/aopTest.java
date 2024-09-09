package com.spring.source.code.aop.base;

import org.testng.annotations.Test;

/**
 * 1.连接点：
 *  一个类中的那些方法可以被增强，这些方法称为切入点
 *
 * 2.切入点
 *  实际真正增强的方法，称为切入点
 *
 * 3. 通知类型：
 *  前置通知
 *  后置通知
 *  环绕通知
 *  异常通知
 *  最终通知
 *
 * 4.切面
 *  把通知引用到切入点的过程
 *
 * 5.切入点的表达式
 *   execution([权限修饰符],[返回类型],[类的全路径]，[方法名称]，[参数列表])
 *   案例1： execution(* com.spring.source.code.aopTest.*)    针对 com.spring.source.code.aopTest这个类中的所有方法进行增强
 *
 *
 *  AOP底层原理：
 *  1.有接口的情况下，使用的是JDK动态代理
 *  2.没有接口的情况下使用CGLIB动态代理
 *
 *
 *
 *
 */
public class aopTest {

    @Test
    public void test() {

    }
}
