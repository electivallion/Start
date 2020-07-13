package part1.task7;

public class Main {
    public static void main(String[] args) {
        int amount = 100;

        Cat[] cats = new Cat[] {
                new Cat("Barsik", 30),
                new Cat("Murzik", 30),
                new Cat("Pantera", 50)
        };

        Plate plate = new Plate(amount);
        System.out.println("В тарелке " + plate.getFood() + "г корма!\n");

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].getSatiety();
            System.out.println();
        }

        plate.setFood(amount);
        System.out.println("В тарелку положили ещё " + amount + "г корма!\n");

        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isSatiety()) {
                cats[i].eat(plate);
                cats[i].getSatiety();
            }
        }
    }
}