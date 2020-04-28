package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Pet("mouse");
        me.pet.name = "Myszojeleń";

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

        new Phone();
        new Car();

        me.getCar().sell();
        me.pet.sell();

        FarmAnimal pig = new FarmAnimal("pig");

        String[] myApps = {"facebook", "whatsapp"};

        me.phone = new Phone();
        me.phone.installAnApp("messenger");
        me.phone.installAnApp(myApps);

        System.out.println(me.pet);

        pig.feed();
        me.feed();
        me.feed(2.0);

    }
}
