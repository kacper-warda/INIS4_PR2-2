package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double salary = 2000.0;

    public Human() {
        super("homo sapiens", 80.0);
    }


    public Double getSalary() {
        return salary;
    }

    public void riseMySalary() {
        this.salary *= 1.1;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) throws Exception {
        if (car.value > this.salary * 12) {
            throw new Exception("nie stać cie, sorry");
        } else {
            this.car = car;
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.species;
    }

    public void sell() throws Exception {
        throw new Exception("you cannot sell humans you idiot!");
    }

    public void beEaten() throws Exception {
        throw new Exception("go away devil!");
    }

    public void feed() {
        System.out.println("dziena");
    }

    public void feed(Double foodWeight) {
        this.weight += foodWeight;
        if (foodWeight > 1.0) {
            System.out.println("nie przeginasz?");
        } else {
            System.out.println("dzięki, dzięki, a masz jeszcze?");
        }
    }
}
