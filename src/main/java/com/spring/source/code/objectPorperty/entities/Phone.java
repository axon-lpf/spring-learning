package com.spring.source.code.objectPorperty.entities;

public class Phone {

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;

    private String name;

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
