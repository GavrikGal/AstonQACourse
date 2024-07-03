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
        System.out.println(isNegative(0));

        System.out.println("\n___Task 8____");
        try {
            printStringNTimes("Привет", 7);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n___Task 9____");
        try {
            System.out.println(isLeapYear(404));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n___Task 10___");
        reverseMassive();

        System.out.println("\n___Task 11___");
        array();

        System.out.println("\n___Task 12___");
        arraysElementsSmallerThanSix();

        System.out.println("\n___Task 13___");
        try {
            squareArray(7);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n___Task 14___");
        try {
            var array = arrayWithLengthAndInitialValue(6, 42);
            System.out.println(Arrays.toString(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printThreeWords() {
        List<String> words = new ArrayList<>(
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
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
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

    public static boolean isNegative(int n) {
        return n < 0;
    }

    public static void printStringNTimes(String string, int n)
            throws IllegalArgumentException {
        validateGreaterThanZero(n);
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear(int year)
            throws IllegalArgumentException {
        validateGreaterThanZero(year);

        if (year % 4 == 0) {
            return year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }

    public static void reverseMassive() {
        var array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] - 1) / -1;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void array() {
        var array = new int[100];
        for (int i = 0; i < array.length; ) {
            array[i] = ++i;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void arraysElementsSmallerThanSix() {
        var array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void squareArray(int n)
            throws IllegalArgumentException {
        validateGreaterThanZero(n);
        var array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ((i - j) == 0) || ((i + j) == (n - 1)) ? 1 : 0;
            }
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] arrayWithLengthAndInitialValue(
            int len, int initialValue) throws IllegalArgumentException {
        validateGreaterThanZero(len);
        var array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    private static void validateGreaterThanZero (int n)
            throws IllegalArgumentException{
        if (n <= 0)
            throw new IllegalArgumentException("Value must be greater than 0");
    }

}