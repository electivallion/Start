package part1.task7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    {
        satiety = false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void getSatiety() {
        if (satiety) {
            System.out.println(name + " облизывает лапки...");
        } else {
            System.out.println(name + " всё ещё хочет кушать!");
        }
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            System.out.println(name + " сьел(-а) " + appetite + "г корма!");
            satiety = true;
        } else {
            System.out.println("Для " + name + " в тарелке недостаточно корма!");
        }
    }
}