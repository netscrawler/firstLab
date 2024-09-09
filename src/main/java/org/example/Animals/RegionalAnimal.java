package org.example.Animals;

public abstract class RegionalAnimal extends Animal {
    private static int regionalAnimalCount = 0;

    public RegionalAnimal(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        regionalAnimalCount++;
    }

    public abstract void dangerous(Animal potentialThreat);

    public static int getRegionalAnimalCount() {
        return regionalAnimalCount;
    }
}
