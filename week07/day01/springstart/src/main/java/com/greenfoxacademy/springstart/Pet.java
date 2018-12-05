package com.greenfoxacademy.springstart;

public class Pet {

    String name;
    int age;

    public Pet(String name) {
        this.name = name;
        this.age = 12;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
