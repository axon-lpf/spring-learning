package com.spring.source.code.objectPorperty.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", books=" + Arrays.toString(books) +
                ", bookList=" + bookList +
                ", bookMaps=" + bookMaps +
                ", bookSets=" + bookSets +
                '}';
    }

    private String [] courses;



    private List<String> list;



    private Map<String,String> maps;

    private Set<String> sets;


    private Book [] books;

    private List<Book> bookList;

    private Map<String,Book> bookMaps;

    private Set<Book> bookSets;

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setBookMaps(Map<String, Book> bookMaps) {
        this.bookMaps = bookMaps;
    }

    public void setBookSets(Set<Book> bookSets) {
        this.bookSets = bookSets;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
}
