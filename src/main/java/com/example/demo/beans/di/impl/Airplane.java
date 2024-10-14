package com.example.demo.beans.di.impl;

import com.example.demo.beans.di.Vehicle;
import com.example.demo.beans.ioc.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// Spring will automatically create a bean without us having to do so.
public class Airplane implements Vehicle {

    private final Engine engine;

    // Engine is also a bean, spring can inject this in for us, if one is available...
    @Autowired
    public Airplane(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public String drive() {
        return "I am flying this plane";
    }

    @Override
    public String toString() {
        return "Airplane";
    }

}
