package part1.task6.animals;

public class Animal {
    String type;
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    static private int animalCount;

    static {
        // Cтатический блок инициализации класса Animal
        animalCount = 0;
    }

    {
        // Нестатический блок инициализации класса Animal
    }

    public Animal() {
    }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int dispersionPercent) {
        this(type, name, maxRunDistance, maxSwimDistance);
        this.maxRunDistance *= Math.random() * dispersionPercent / 100 + 1;
        this.maxSwimDistance *= Math.random() * dispersionPercent / 100 + 1;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно пробежал(-а) " + distance + "м!");
        } else {
            System.out.println(type + " " + name + " не сможет пробежать " + distance + "м!");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать!");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыл(-а) " + distance + "м!");
        } else {
            System.out.println(type + " " + name + " не сможет проплыть " + distance + "м!");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}