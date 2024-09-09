package com.spring.source.code.objectPorperty.entities;

public class Book {

    private String name;

    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void test() {
        System.out.println("我是一本书");
    }
}
