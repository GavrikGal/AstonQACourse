import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        System.out.println("---- Task 1 ----");
        task1();

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

}