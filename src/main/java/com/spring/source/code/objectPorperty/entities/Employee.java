package com.spring.source.code.objectPorperty.entities;

/**
 * 员工
 */
public class Employee {

    @Override
    public String toString() {
        return "Empoyee{" +
                "id='" + id + '\'' +
                ", empoyeeName='" + empoyeeName + '\'' +
                ", dept=" + dept +
                '}';
    }

    private String id;

    private String empoyeeName;

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmpoyeeName(String empoyeeName) {
        this.empoyeeName = empoyeeName;
    }

    public void printDept() {
        System.out.println(this.dept);
    }
}
