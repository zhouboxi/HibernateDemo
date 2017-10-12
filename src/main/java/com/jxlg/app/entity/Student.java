package com.jxlg.app.entity;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable{
    private String sid;
    private String name;
    private Set<Teacher> teachers;
    public Student() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
