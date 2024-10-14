package com.example.demo.rest.responses.impl;

import com.example.demo.rest.responses.Animal;

public class Giraffe extends Animal {

    public Giraffe() {
        name = "Fred";
    }

    public void bark() {
        System.out.println("Dog barking");
    }

}
