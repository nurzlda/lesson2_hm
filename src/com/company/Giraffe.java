package com.company;

public class Giraffe extends Animal {
    private double height;

    public Giraffe(String name, double height) {
        super(name);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "Height in meters: " + height + " \uD83E\uDD92");

    }
}

