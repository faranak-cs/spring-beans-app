package com.example.demo.rest.controllers;

import com.example.demo.beans.di.Vehicle;
import com.example.demo.beans.di.impl.Airplane;
import com.example.demo.beans.di.impl.Car;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
// Generates a constructor, final fields are as params, so spring can inject them.
public class DriveController {

    private final Vehicle vehicle; // will select bean of type vehicle, rename field to select specific instance of bean, i.e boat, airplane, etc.

    // Example of dependency inject where airplane bean will be injected.
    /*
       @Autowired
       public DriveController(Vehicle airplane) {
            this.vehicle = airplane;
       }
    */

    @GetMapping("/drive")
    public String drive() {
        System.out.println(vehicle.drive());
        return vehicle.toString();
    }

}
