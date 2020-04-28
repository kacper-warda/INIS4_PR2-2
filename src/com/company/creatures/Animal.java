package com.company.creatures;

import com.company.Saleable;

import java.io.File;

abstract public class Animal implements Saleable, Feedable {
    final String species;
    protected Double weight;
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

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public void feed() {
        feed(1.0);
    }

    public void feed(Double foodWeight) {
        if (weight <= 0) {
            System.out.println("too late man");
        } else {
            weight += foodWeight;
            System.out.println("thx for food bro, my weight is now " + this.weight);
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("you can't walk the town with dead animal you freak");
        } else if (weight <= 3) {
            System.out.println("nice walk, but I'm hungry");
        } else {
            System.out.println("nice walk, my weight is now " + this.weight);
        }
    }

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void sell() throws Exception {
        System.out.println("Animal sold " + this.species);
    }
}
