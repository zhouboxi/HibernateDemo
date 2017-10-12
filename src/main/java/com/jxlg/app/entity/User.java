package com.jxlg.app.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{
    private String uid;
    private String name;
    private Date   birthday;

    public User() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
