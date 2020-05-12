package com.company.creatures;

import java.util.Comparator;

public class FarmAnimalWeightComparator implements Comparator<FarmAnimal> {
    @Override
    public int compare(FarmAnimal o1, FarmAnimal o2) {
        return o1.weight.intValue() - o2.weight.intValue() ;
    }
}
