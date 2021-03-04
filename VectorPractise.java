import java.util.Vector;
import java.util.Collections;

public class VectorPractise {
    
    public static void main(String[] args) {
        //Declaring Vector of Integer type linked list
        Vector<Integer> numbers = new Vector<Integer>();//default size 10 
        // Vector<Integer> numbers = new Vector<Integer>(5);//capacity: 5
        // Vector<Integer> numbers = new Vector<Integer>(5,6);
        // intialCapacity:5 when it becomes finished then size increased 6

        // Adding elements
        numbers.addElement(2);
        numbers.addElement(1);
        numbers.addElement(7);
        numbers.addElement(5);
        
        // Sorting 
        Collections.sort(numbers);

        // iterating through items
        for (int keep : numbers) {
            System.out.print(keep + " ");
        }
        System.out.println("\nSize : "+numbers.size());
        System.out.println("\n2 at position: " + numbers.indexOf(2));
    }
}
