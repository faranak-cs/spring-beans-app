package com.example.demo.rest.responses.impl;

import com.example.demo.rest.responses.Animal;

public class Monkey extends Animal {

    public Monkey() {
        name = "Simon";
    }

    public void bark() {
        System.out.println("Peels banana");
    }

}
