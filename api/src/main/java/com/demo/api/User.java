package com.demo.api;

import java.util.Date;

public class User {
    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Date birthDate;
}
