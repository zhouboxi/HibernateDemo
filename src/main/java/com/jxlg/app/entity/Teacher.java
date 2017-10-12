package com.jxlg.app.entity;

import java.io.Serializable;
import java.util.Set;

public class Teacher implements Serializable{
    private String tid;
    private String name;
    private Set<Student> students;

    public Teacher() {
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
