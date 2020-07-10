package part1.task6.animals;

public class Dog extends Animal {
    private static int animalCount;

    static {
        // Cтатический блок инициализации класса Dog
        animalCount = 0;
    }

    {
        // Нестатический блок инициализации класса Dog
    }

    public Dog(String name) {
        super("Собака", name, 250, 20);
        animalCount++;
    }

    public Dog(String name, int dispersionPercent) {
        super("Собака", name, 250, 20, dispersionPercent);
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}