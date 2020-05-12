package com.company.creatures;

public class FarmAnimal extends Animal implements Edible, Comparable<FarmAnimal> {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println("adiooos");
    }

    @Override
    public int compareTo(FarmAnimal o) {
        return this.weight.intValue() - o.weight.intValue();
    }
}
