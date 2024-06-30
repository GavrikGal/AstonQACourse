import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.println("___Task 1____");
        printThreeWords();

        System.out.println("\n___Task 2____");
        checkSumSign();

        System.out.println("\n___Task 3____");
        printColor();

        System.out.println("\n___Task 4____");
        compareNumbers();

        System.out.println("\n___Task 5____");
        System.out.println(compareNumbers(15, 6));

        System.out.println("\n___Task 6____");
        checkPositive(-1);

        System.out.println("\n___Task 7____");
        System.out.println(is_negative(0));

        System.out.println("\n___Task 8____");
        printStringNTimes("Привет", 4);

    }

    public static void printThreeWords() {
        List<String> words = new ArrayList<String>(
                Arrays.asList("Orange", "Banana", "Apple")
        );

        for (String word : words) {
            System.out.println(word);
        }

    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;

        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;

        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static boolean compareNumbers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void checkPositive(int n) {
        if (n >= 0)
            System.out.println("Передали положительное число");
        else
            System.out.println("Передали отрицательное число");
    }

    public static boolean is_negative(int n) {
        return n < 0;
    }

    public static void printStringNTimes(String string, int N) {
        for (int i=0; i<N; i++) {
            System.out.println(string);
        }
    }

}