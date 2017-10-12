package com.jxlg.app.entity;

import java.io.Serializable;

public class Animal implements Serializable{
    private String aid;
    private String name;
    private People people;

    public Animal() {
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
