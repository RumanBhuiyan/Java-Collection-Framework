import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractise {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        // Iterating using traditional for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); 
        }

        //Iterating using for-each loop
        numbers.forEach((entity)->{
            System.out.println(entity);
        });

        // Iterating using for-of loop
        for (int keep : numbers) {
            System.out.println(keep);
        }

        // Iterator 
        Iterator<Integer> pointer = numbers.iterator();

        while (pointer.hasNext()) {
            System.out.print(pointer.next() + " ");
        }
    }
}
