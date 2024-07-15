package task1;

public abstract class Animal {
    protected String name;
    protected static int totalAnimals = 0;

    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}