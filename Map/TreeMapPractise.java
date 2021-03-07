// TreeMap is simillar as HashMap only difference is its keys become
// sorted in ascending order.it has put(),replace(),remove() etc like HashMap
import java.util.TreeMap;

public class TreeMapPractise {
  
    public static void main(String[] args) {
        
        TreeMap<Integer, String> country = new TreeMap<>();

        country.put(2, "India");
        country.put(5, "London");
        country.put(1, "Bangladesh");
        country.put(4, "Japan");

        System.out.println(country);
    }
}
