package com.example.demo.rest.controllers;

import com.example.demo.rest.responses.Animal;
import com.example.demo.rest.responses.impl.Duck;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello-world")
    public String helloWorldParams(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/hello-duck")
    public ResponseEntity<Duck> helloWorld() {
        return ResponseEntity.status(200).body(new Duck());
    }

    @PostMapping("/sendSomeData")
    public ResponseEntity<Animal> helloWorld(@RequestBody String someString) {
        System.out.println("serverSide" + someString);
        final Duck body = new Duck();
        body.setName(someString);
        return ResponseEntity.status(200).body(body);
    }

    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok(200);
    }
}
