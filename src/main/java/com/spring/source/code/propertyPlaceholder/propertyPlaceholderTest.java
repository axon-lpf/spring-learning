package com.spring.source.code.propertyPlaceholder;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 *  通过加载外部配置文件读取配置
 *  详细内容情况 property_placeholder.xml 的配置
 *
 */
public class propertyPlaceholderTest {

    @Test
    public void  test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("property_placeholder.xml");
        DruidDataSource datasource = context.getBean("datasource", DruidDataSource.class);
        System.out.println(datasource.getUrl());
    }
}
