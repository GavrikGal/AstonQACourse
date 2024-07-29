import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        System.out.println("---- Task 1 ----");
        task1();

        System.out.println("\n---- Task 2 ----");
        task2();

    }

    public static void task1() {
        String[] words = {
                "яблоко", "банан", "яблоко", "апельсин", "банан",
                "киви", "яблоко", "груша", "персик", "киви", "слива",
                "яблоко", "слива", "банан", "виноград", "персик"
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Частота встречаемости слов: " + wordCount);
    }

    public static void task2() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+375-29-123-45-67");
        phoneBook.add("Петров", "+375-33-987-65-43");
        phoneBook.add("Иванов", "+375-25-555-12-34");

        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Сидоров: " + phoneBook.get("Сидоров"));
    }

}