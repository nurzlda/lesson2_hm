package com.company;

public class Wolf extends Animal {
    private String color;

    public Wolf(String name, String color) {
        super(name);
        this.color = color;
    }


    @Override
    public void print() {
        System.out.println("Name: " + getName() + "Color: " + color + "\uD83D\uDC3A");

    }
}
