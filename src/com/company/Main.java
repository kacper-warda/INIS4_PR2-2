package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

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


        Car dirtyOne = new Car();
        dirtyOne.producer = "fiat";
        dirtyOne.model = "bravo";
        dirtyOne.yearOfProduction = 2015;
        dirtyOne.setPlates("GDA323");

        me.setCar(dirtyOne);

        Human myWife = new Human();
        myWife.firstName = "Karolina";
        myWife.lastName = "Warda";
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.setCar(me.getCar());

        System.out.println(myWife.getCar().getPlates());

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());

        System.out.println(me);
        System.out.println(myWife);

        System.out.println(me.pet);

        myWife.feed();
        me.takeForAWalk();
        System.out.println(me.species);
    }
}
