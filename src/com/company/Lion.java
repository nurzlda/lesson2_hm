package com.company;

public class Lion extends Animal {

    private String title;

    public Lion(String name, String title) {
        super(name);
        this.title = title;
    }


    @Override
    public void print() {
        System.out.println("Name: " + getName() + "Title: " + title + "\uD83E\uDD81");

    }
}
