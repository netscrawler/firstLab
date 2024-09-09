package org.example.Animals;

public class Moose extends RegionalAnimal {
    private static int mooseCount = 0;

    public Moose(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        mooseCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м");
        }
    }

    @Override
    public void dangerous(Animal potentialThreat) {
        if (potentialThreat instanceof Tiger) {
            System.out.println(name + " чувствует угрозу от " + potentialThreat.name);
        } else {
            System.out.println(name + " не чувствует угрозу от " + potentialThreat.name);
        }
    }

    public static int getMooseCount() {
        return mooseCount;
    }
}
