// HashSet is similar as ArrayList except few differences
// i)ArrayList doesn't take null but HashSet takes
// ii) ArrayList takes duplicate items but HashSet doesn't take
// iii) ArrayList maintain an order at the time of returning  items 
//but HashSet returns items at random order doesn't follow insertion order
import java.util.HashSet;

public class HashSetPractise {
   
    public static void main(String[] args) {
        
        HashSet<String> names = new HashSet<String>();

        names.add("Ruman");
        names.add("Bhuiyan");
        names.add("Sany");
        names.add(null);//It accepts null also
        names.add("Ruman");// it doesn't take duplicate item

        System.out.println(names);

        //Iteration
        names.forEach((item) -> {
            System.out.println(item);
        });
    }
}
