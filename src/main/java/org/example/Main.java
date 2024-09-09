package org.example;

import org.example.Animals.*;

class Main {
    public static void main(String[] args) {
        int distSw;
        int dist;
        Animal[] pets =
                {
                        new Dog("Бобик", 500, 10),
                        new Dog("Шарик", 400, 20),
                        new Cat("Мурзик", 300),
                        new Cat("Барсик", 200),
                        new Tiger("Шерхан", 1000, 50),
                        new Tiger("Балу", 800, 30),
                        new Hare("Ушастик", 100, 5),
                        new Moose("Рогатый", 300, 40),
                        new Beaver("Зубастик", 100, 10),
                        new Stoat("Ласка", 150, 20),
                        new AmurTiger("Амур", 800, 40),
                        new PolarBear("Белый Балу", 800,150)
                };

        for (Animal a : pets) {
            if (a instanceof EndangeredAnimal) {
                ((EndangeredAnimal) a).count();
                System.out.println("\n");
            }else if (a instanceof RegionalAnimal) {
                ((RegionalAnimal) a).dangerous(pets[5]);
                ((RegionalAnimal) a).dangerous(pets[0]);
                ((RegionalAnimal) a).dangerous(pets[3]);
                System.out.println("\n");
            }else{
                System.out.println("Бег");
                a.run(dist = 301);
                System.out.println("Плавание");
                a.swim(distSw = 30);
                System.out.println("\n");
            }
        }


        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("\n");

        System.out.println("Общее количество базовых животных: " + (Animal.getAnimalCount()-EndangeredAnimal.getEndangeredAnimalCount()-RegionalAnimal.getRegionalAnimalCount()));
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество кошек: " + Cat.getCatCount());
        System.out.println("Количество тигров: " + Tiger.getTigerCount());
        System.out.println("\n");
        System.out.println("Количество региональных животных: " + RegionalAnimal.getRegionalAnimalCount());
        System.out.println("Количество зайцев: " + Hare.getHareCount());
        System.out.println("Количество лосей: " + Moose.getMooseCount());
        System.out.println("Количество бобров: " + Beaver.getBeaverCount());
        System.out.println("\n");
        System.out.println("Количество краснокнижных животных: " + EndangeredAnimal.getEndangeredAnimalCount());
        System.out.println("Количество ласок: " + Stoat.getStoatCount());
        System.out.println("Количество амурских тигров: " + AmurTiger.getAmurTigerCount());
        System.out.println("Количество Белых медведей: " + PolarBear.getAmurTigerCount());

//        stoat1.count();
//        amurTiger1.count();
    }
}
