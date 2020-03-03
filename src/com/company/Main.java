package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();

        System.out.println("twoja stara");

        Car dirtyOne = new Car();
        dirtyOne.producer = "fiat";
        dirtyOne.model = "bravo";
        dirtyOne.yearOfProduction = 2015;
        dirtyOne.plates = "GDA32342";

        me.car = dirtyOne;

        System.out.println(me.car.plates);

    }
}
