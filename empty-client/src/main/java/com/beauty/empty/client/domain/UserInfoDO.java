package com.beauty.empty.client.domain;

import java.io.Serializable;

/**
 * Created by kenan@xiaokakeji.com
 * on 2017/3/19.
 */
public class UserInfoDO implements Serializable {

    private int id;

    private String name;

    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
