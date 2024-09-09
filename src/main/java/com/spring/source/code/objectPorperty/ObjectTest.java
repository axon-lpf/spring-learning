package com.spring.source.code.objectPorperty;

import com.spring.source.code.objectPorperty.entities.*;
import com.spring.source.code.objectPorperty.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class ObjectTest {

    /**
     * spring 中通过xml给对象属性赋值的几种方式
     * 1.对象属性赋值
     * 2.字面量赋值，即赋值为null
     * 3.特殊字符的赋值
     * 4.通过对象构造函数赋值
     * 5.引用类型赋值法
     * 6.p空间赋值法，赋值必须要引用   xmlns:p="http://www.springframework.org/schema/p
     * 7.内部bean的赋值法
     * 8.级联赋值法
     */
    @Test
    public void testObjectProperty() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("object_property_test.xml");
        User user = context.getBean("user", User.class);
        user.test();
        System.out.println(user);


        Book book = context.getBean("book", Book.class);
        book.test();
        System.out.println(book.toString());

        IUserService userService = context.getBean("userService", IUserService.class);
        boolean b = userService.saveUser(user);

        Phone phone = context.getBean("phone", Phone.class);
        System.out.println(phone.toString());

        Employee employee = context.getBean("employee", Employee.class);
        employee.printDept();
        System.out.println(employee);

        employee = context.getBean("employee2", Employee.class);
        employee.printDept();
        System.out.println(employee);

    }

    /**
     * 集合赋值法
     * 1. 数组赋值法
     * 2.集合赋值法
     * 3.map赋值法
     * 4.set赋值法
     */
    @Test
    public void testObjectList() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("object_list_test.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
