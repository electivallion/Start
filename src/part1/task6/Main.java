package part1.task6;

import part1.task6.animals.Animal;
import part1.task6.animals.Cat;
import part1.task6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 80),
                new Cat("Murzik", 90),
                new Dog("Tuzik", 30),
                new Dog("Bim", 40),
                new Dog("Lord", 50)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
            animals[i].swim(25);
            System.out.println();
        }

        System.out.println("Количество котов: " + Cat.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getAnimalCount());
        System.out.println("Количество животных: " + Animal.getAnimalCount());
    }
}