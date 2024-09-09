package com.spring.source.code.beanScope.entities;

public class BeanScope {

    private String name;

    @Override
    public String toString() {
        return "BeanScope{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
