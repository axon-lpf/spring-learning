package com.spring.source.code.beanLifecycle.entities;

public class BeanLifecycle {

    public  BeanLifecycle(){

        System.out.println("第1步骤-----执行构造方法");
    }

    public void setName(String name) {
        System.out.println("第2步步骤-----设置属性");
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BeanLifecycle{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    private String name;

    private  String id;


    public void initMethod(){
        System.out.println("第3步步骤------执行初始化方法");
    }


    public void execute(){
        System.out.println("第4步骤---- bean构建完成，调用bean的相关属性和方法");
    }


    public  void destroy(){

        System.out.println("第5步骤------释放bean");
    }
}
