package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Objects.requireNonNull(createObject("Lion")).print();
        Objects.requireNonNull(createObject("Giraffe")).print();
        Objects.requireNonNull(createObject("Wolf")).print();


    }

    public static Animal createObject(String className){
        return switch (className) {
            case "Lion" -> new Lion("Lion, ", "The king of animals  ");
            case "Giraffe" -> new Giraffe("Giraffe, ", 5.5);
            case "Wolf" -> new Wolf("Wolf, ", "Gray");
            default -> null;
        };
    }


    }