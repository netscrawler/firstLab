package org.example.Animals;

public class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        catCount++;
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
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatCount() {
        return catCount;
    }
}
