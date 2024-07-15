import task1.*;
import task2.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("____ Task 1 ____");
        task1();

        System.out.println("\n____ Task 2 ____");
        task2();
    }

    public static void task1() {
        Dog dog1 = new Dog("Бобик");
        dog1.run(150);
        dog1.run(-1);
        dog1.swim(5);
        dog1.swim(-1);

        Cat cat1 = new Cat("Мурзик");
        cat1.run(100);
        cat1.run(-1);
        cat1.swim(5);

        Cat[] cats = {new Cat("Барсик"),
                new Cat("Рыжик"),
                new Cat("Васька")};
        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isSatiety());
        }

        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Всего собак: " + Dog.getTotalDogs());
        System.out.println("Всего котов: " + Cat.getTotalCats());
    }

    public static void task2() {

        Circle circle = new Circle(5, "красный", "черный");
        Rectangle rectangle = new Rectangle(4, 6, "синий", "зеленый");
        Triangle triangle = new Triangle(3, 4, 5, "желтый", "фиолетовый");

        Characterizable[] shapes = {circle, rectangle, triangle};

        for (Characterizable shape : shapes) {
            try {
                System.out.println(shape.getCharacteristics());
            } catch (NotImplementedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}