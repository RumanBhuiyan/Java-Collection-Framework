import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractise{
    
    public static void main(String[] args) {
        //Decalring ArrayList
        ArrayList<String> names = new ArrayList<String>();

        //Adding items to array
        names.add("Ruman");
        names.add("Robi");
        names.add("Robin");
        names.add(3, "Ratul");
        
        // Changing items
        names.set(3, "Shojib");

        //Removing items
        names.remove("Robi");
        names.remove(2);

        //Accessing items
        for (String name : names) {
            System.out.print(name+" ");
        }
        
        System.out.println("\n Before Sorting : " + names);
        // Sorting 
        Collections.sort(names);

        System.out.println("After Sorting : "+names);
        System.out.println("ArrayList Size : " + names.size());
        System.out.println("Ruman at index : " + names.indexOf("Ruman"));
    }
}
