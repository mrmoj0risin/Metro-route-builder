import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {

    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4){
            throw new IllegalArgumentException("Wrong format. Correct format:" +
                    " add Василий Петров vasily.petrov@gmail.com +79215637722");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        String email;
        String regexEmail = "^(.+)@(\\S+)$";
        Pattern emailPattern = Pattern.compile(regexEmail, Pattern.MULTILINE);
        Matcher emailMatcher =emailPattern.matcher(components[INDEX_EMAIL]);

        if (emailMatcher.matches()){
            email = emailMatcher.group(0);
        }
        else {
            throw new RuntimeException("Incorrect email syntax");
        }

        String phone;
        String regexPhone = "[+7]\\d{11}|[8|7]\\d{10}";
        Pattern phonePattern = Pattern.compile(regexPhone, Pattern.MULTILINE);
        Matcher phoneMatcher = phonePattern.matcher(components[INDEX_PHONE]);

        if (phoneMatcher.find()){
            phone = phoneMatcher.group(0);
        }
        else {
            throw new RuntimeException("Incorrect phone number syntax");
        }
        storage.put(name, new Customer(name, phone, email));
    }

    public void listCustomers() {
        if (storage.isEmpty()){ throw new RuntimeException("List is empty");}
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        if (storage.containsKey(name)) {
            storage.remove(name);
        }
        else { throw new RuntimeException("No customer with name - " + name);}
    }

    public Customer getCustomer(String name) {
        if (storage.containsKey(name)) {
            return storage.get(name);
        }
        else { throw new RuntimeException("No customer with name - " + name);}
    }

    public int getCount() {
        return storage.size();
    }

}