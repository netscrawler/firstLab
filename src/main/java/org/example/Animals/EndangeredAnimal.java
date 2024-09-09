package org.example.Animals;

public abstract class EndangeredAnimal extends Animal {
    private static int endangeredAnimalCount = 0;

    public EndangeredAnimal(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        endangeredAnimalCount++;
    }

    public abstract void count(
    );

    public static int getEndangeredAnimalCount() {
        return endangeredAnimalCount;
    }
}
