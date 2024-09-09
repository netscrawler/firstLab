package org.example.Animals;

public class Stoat extends EndangeredAnimal {
    private static int stoatCount = 0;

    public Stoat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        stoatCount++;
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
    public void count() {
        System.out.println(name + ": численность вида около 50000 особей.");
    }

    public static int getStoatCount() {
        return stoatCount;
    }
}
