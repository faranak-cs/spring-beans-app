package com.example.demo.rest.responses.impl;

import com.example.demo.rest.responses.Animal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Duck extends Animal {

    private final int windSize = 1;

    public Duck() {
        name = "Timmy";
    }

    public void fly() {
        System.out.println("Duck flying");
    }

}
