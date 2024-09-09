package com.spring.source.code.objectPorperty.entities;

public class User {

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private Long id;

    private String name;

    private int age;

    private String email;

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void test() {
        System.out.println("我是" + this.name);
    }
}
