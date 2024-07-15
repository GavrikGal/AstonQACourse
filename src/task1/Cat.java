package task1;

public class Cat extends Animal {
    private static int totalCats = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        totalCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            satiety = true;
            System.out.println(name + " покушал и стал сытым.");
        } else {
            System.out.println(name + " не хватает еды. В миске осталось " + bowl.getFoodAmount() + " еды.");
        }
    }

    public static int getTotalCats() {
        return totalCats;
    }
}