import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        List<String> phones = phoneBook.get(lastName);
        if (phones == null) {
            phones = new ArrayList<>();
            phoneBook.put(lastName, phones);
        }
        phones.add(phoneNumber);
    }

    public List<String> get(String lastName) {
        List<String> phones = phoneBook.get(lastName);
        return phones != null ? phones : new ArrayList<>();
    }


}
