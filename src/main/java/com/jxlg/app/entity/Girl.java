package com.jxlg.app.entity;

import java.io.Serializable;

public class Girl implements Serializable{
    private String gid;
    private String name;

    public Girl() {
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
