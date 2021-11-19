package com.example.springboot;

import java.io.Serializable;

public class Test implements Serializable {

    private static final long serialVersionUID = -1764970284520387975L;

    private String name;
    
    public Test() {}

    public Test(String name) {
    	this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}