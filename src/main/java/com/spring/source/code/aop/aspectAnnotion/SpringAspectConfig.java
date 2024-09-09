package com.spring.source.code.aop.aspectAnnotion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.spring.source.code.aop.aspectAnnotion"})
@EnableAspectJAutoProxy  // 启用aop注解
public class SpringAspectConfig {
}
