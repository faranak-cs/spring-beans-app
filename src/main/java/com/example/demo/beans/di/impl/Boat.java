package com.example.demo.beans.di.impl;

import com.example.demo.beans.di.Vehicle;

// TODO - 1.0 Have spring create a bean instance of this class
// TODO - 1.1 - Add any engine to our boat
// TODO - 1.2 - Choose a specific engine type that only this boat would use,
public class Boat implements Vehicle {

    @Override
    public String drive() {
        return "I am piloting a boat with a " + engine.toString; // FIXME
    }
}
