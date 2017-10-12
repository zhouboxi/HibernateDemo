package com.jxlg.app.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private String aid;
    private String address;
    private User user;

    public Address() {
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
