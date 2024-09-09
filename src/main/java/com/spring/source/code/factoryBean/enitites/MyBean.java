package com.spring.source.code.factoryBean.enitites;

public class MyBean {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }

    public  void test() {
        System.out.println(" 阿西吧 ，mybean");
    }
}
