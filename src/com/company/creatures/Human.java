package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car[] garage = new Car[3];
    private Double salary = 2000.0;
    public Double cash = 20000.0;

    public FarmAnimal[] myAnimals = new FarmAnimal[4];

    public Human() {
        super("homo sapiens", 80.0);
    }


    public Double getSalary() {
        return salary;
    }

    public void riseMySalary() {
        this.salary *= 1.1;
    }

    public Car getCar(int carNumber) {
        return garage[carNumber];
    }


    public void removeCar(Car newCar) throws Exception {
        boolean success = false;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == newCar) {
                garage[i] = null;
                success = true;
                break;
            }
        }
        if (!success) {
            throw new Exception("nie posiadam takiego samochodu");
        }
    }


    public void setCar(Car newCar) throws Exception {
        boolean success = false;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                this.setCar(newCar, i);
                success = true;
                break;
            }
        }
        if (!success) {
            throw new Exception("brak miejsc w garażu");
        }

    }

    public void setCar(Car car, int carNumber) throws Exception {
        if (garage[carNumber] != null) {
            throw new Exception("to miejsce jest już zajęte");
        }

        this.garage[carNumber] = car;
        car.owners.add(this);
    }

    public Double getCarsValue() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
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

    public Car[] getGarage() {
        return this.garage;
    }

    public boolean hasCar(Car newCar) {
        boolean hasCar = false;
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean couldBuyCar(Car newCar, Double price) throws Exception {
        if (price > this.cash) {
            throw new Exception("sorry, brak kasy");
        }
        if (!this.hasFreePlaceInGarage()) {
            throw new Exception("sorry, brak miejsca");
        }
        return true;
    }

    private boolean hasFreePlaceInGarage() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }
}
