package part1.task6.animals;

public class Cat extends Animal {
    private static int animalCount;

    static {
        // Cтатический блок инициализации класса Cat
        animalCount = 0;
    }

    {
        // Нестатический блок инициализации класса Cat
    }

    public Cat(String name) {
        super("Кот", name, 200, 0);
        animalCount++;
    }

    public Cat(String name, int dispersionPercent) {
        super("Кот", name, 200, 0, dispersionPercent);
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}