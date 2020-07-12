package part1.task7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int amount) {
        food += amount;
    }

    public boolean decreaseFood(int amount) {
        if (food < amount) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }
}