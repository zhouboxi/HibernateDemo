package com.jxlg.app.entity;

import java.io.Serializable;
import java.util.Set;

public class Man implements Serializable{
    private String mid;
    private String name;
    private Set<Girl> girls;

    public Man() {
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Girl> getGirls() {
        return girls;
    }

    public void setGirls(Set<Girl> girls) {
        this.girls = girls;
    }

}
