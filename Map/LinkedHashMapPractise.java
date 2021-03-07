// HashMap doesn’t maintain any order.
// TreeMap sort the entries in ascending order of keys.
// LinkedHashMap maintains the insertion order.
import java.util.LinkedHashMap;

public class LinkedHashMapPractise {
    
    public static void main(String[] args) {
        
        // Declaring HashMap
        LinkedHashMap<Integer, String> country = new LinkedHashMap<>();

        // Adding items
        country.put(1, "Bangladesh");
        country.put(2, "india");
        country.put(3, "pakistan");
        country.put(4, "London");

        // Accessing value
        System.out.println(country.get(2));
        System.out.println(country.keySet());
        System.out.println(country.values());

        // Changing item
        country.replace(4, "London", "UK");

        // removing items
        country.remove(2);// Remove value of key:2

        System.out.println(country);

        // Iterating
        country.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
    }
}
