package com.example.demo.beans.di.impl;

import com.example.demo.beans.di.Vehicle;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//@Component
// Spring will automatically create a bean
public class Car implements Vehicle {

    // Hook into bean lifecycle, Spring will call this method the bean is instantiated, useful for setup after everything is available.
    @PostConstruct
    public void init() {
        System.out.println("Car init");
    }

    private final String color;

    public Car() {
        this.color = "Yellow";
    }

    @Override
    public String drive() {
        return "I am driving a " + color + " car";
    }

    @Override
    public String toString() {
        return color + " car";
    }
}
