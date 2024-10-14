package com.example.demo.beans;

import com.example.demo.beans.di.Vehicle;
import com.example.demo.beans.di.impl.Airplane;
import com.example.demo.beans.di.impl.Boat;
import com.example.demo.beans.di.impl.Car;
import com.example.demo.beans.ioc.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Garage {
    // This class shows how you can create beans with specific names
    // Spring will call the methods with @Bean annotation.
    // The method name is used as the bean name.

    // If a param is supplied which is another bean, spring will create that dependency first,
    // rinse and repeat if that requires a dependency

    @Bean
    Vehicle boat() {
        return new Boat();
    }

    // TODO - Create a boat with an engine using the @bean way
    //    @Bean
    //    Vehicle boat(Engine) {
    //        ...
    //    }

    /**
     * Primary will become the default bean
     */
    /*
    @Bean @Primary
    Vehicle redCar() {
        return new Car();
    }
     */


    //A bean with a name of blurCar will become the default bean
    // @Bean
    //  Vehicle blueCar() {
    //        return new Car();
    //    }

    //    @Bean
    //    Engine engine() {
    //        new En....
    //    }

    //    @Bean
    //    Vehicle airplane(Engine engine, wheels, wins,......) {
    //        return new Airplane(engine);
    //    }

}
