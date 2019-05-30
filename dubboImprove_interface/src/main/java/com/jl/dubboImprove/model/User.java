package com.jl.dubboImprove.model;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 13:40
 * @Version 1.0
 */
public class User implements Serializable {
    private String id;
    private String username;
    private String age;
    private String sex;
    private String address;

    public User() {
    }

    public User(String id, String username, String age, String sex, String address) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public User(String username, String age, String sex, String address) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
