package com.luxsong.entity;

import java.io.Serializable;

public class User implements Serializable {

    public User() {
    }

    public User(String name, Integer age) {
        this.uid = uid;
        this.name = name;
        this.addree = addree;
        this.age = age;
    }

    private Integer uid;
    private String name;
    private String addree;
    private Integer age;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddree() {
        return addree;
    }

    public void setAddree(String addree) {
        this.addree = addree;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
