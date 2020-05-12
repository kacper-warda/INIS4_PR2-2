package com.company;

import com.company.creatures.*;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";

        Car ferrari = new Car("Ferrari", "FF", 1300000.0);
        Car alfa = new Car("Alfa Romeo", "Julia", 150000.0);
        Car fiat = new Car("Fiat", "Tipo", 50000.0);

        me.setCar(ferrari, 0);
        me.setCar(fiat, 1);
        me.setCar(alfa, 2);

        System.out.println(me.getCarsValue());

        Arrays.sort(me.getGarage());

        System.out.println(me.getCar(0));
        System.out.println(me.getCar(1));
        System.out.println(me.getCar(2));


        List<Car> cars = new LinkedList<Car>();
        cars.add(ferrari);
        cars.add(ferrari);
        cars.add(ferrari);
        cars.add(alfa);
        cars.addAll(Arrays.asList(me.getGarage()));

        System.out.println(cars.get(2));
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());

        Human brotherInLow = new Human();
        brotherInLow.firstName = "Mateusz";

        me.getCar(1).sell(me, brotherInLow, 10000.0);


        Human fatherInLow = new Human();
        fatherInLow.firstName = "Wojciech";

        brotherInLow.getCar(0).sell(brotherInLow, fatherInLow, 15000.0);

        System.out.println(alfa.owners);

    }
}
