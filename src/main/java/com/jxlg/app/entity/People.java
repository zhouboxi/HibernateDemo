package com.jxlg.app.entity;

import java.io.Serializable;
import java.util.Set;

public class People implements Serializable {
    private String pid;
    private String name;
    private Set<Animal> animals;

    public People() {
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
