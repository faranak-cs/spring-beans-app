package com.example.demo.rest.responses;

public abstract class Animal {

    protected String name;

    public void getName() {
        System.out.println(name);
    }

    public void setName(final String name) {
        this.name = name;
    }

}
