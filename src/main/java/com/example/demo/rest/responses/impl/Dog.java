package com.example.demo.rest.responses.impl;

import com.example.demo.rest.responses.Animal;

public class Dog extends Animal {

    public Dog() {
        name = "Fred";
    }

    public void bark() {
        System.out.println("Dog barking");
    }
}
