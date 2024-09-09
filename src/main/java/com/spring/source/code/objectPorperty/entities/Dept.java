package com.spring.source.code.objectPorperty.entities;

/**
 * 部门法
 */
public class Dept {

    private String id;

    private String deptName;



    public void setId(String id) {
        this.id = id;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
