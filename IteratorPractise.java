import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractise {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        Iterator<Integer> pointer = numbers.iterator();

        while (pointer.hasNext()) {
            System.out.print(pointer.next() + " ");
        }
    }
}
