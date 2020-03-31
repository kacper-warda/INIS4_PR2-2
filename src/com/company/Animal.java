package com.company;

import java.io.File;

public class Animal implements Edible, Saleable {
    final String species;
    private Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 123.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("too late man");
        } else {
            weight++;
            System.out.println("thx for food bro, my weight is now " + this.weight);
        }
    }

    void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("you can't walk the town with dead animal you freak");
        } else if (weight <= 3) {
            System.out.println("nice walk, but I'm hungry");
        } else {
            System.out.println("nice walk, my weight is now " + this.weight);
        }
    }

    public String toString(){
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() throws Exception {
        weight = 0.0;
        System.out.println("adiooooooos " + this.species);
    }

    @Override
    public void sell() throws Exception {
        System.out.println("Animal sold " + this.species);
    }
}
