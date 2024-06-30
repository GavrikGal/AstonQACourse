import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.println("___Task 1____");
        printThreeWords();

        System.out.println("\n___Task 2____");
        checkSumSign();

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


}