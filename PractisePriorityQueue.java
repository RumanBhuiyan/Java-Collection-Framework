import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class PractisePriorityQueue {
  
    public static void main(String[] args) {
        //Decalaring 
        Queue<Integer> numbers = new PriorityQueue<>();

        //Adding items 
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);
        numbers.add(7);

        System.out.println(numbers);// 2 4 3 8 7

        //poping items
        int keep = numbers.poll();

        System.out.println(keep);
        System.out.println(numbers);// 3 4 7 8

        numbers.remove();
        System.out.println(numbers); // 4 8 7

        //Iterating 
        // process : 01
        numbers.forEach((item)->{
            System.out.println(item);
        });
        // process : 02
        Iterator<Integer> pointer = numbers.iterator();
        while (pointer.hasNext()) {
            System.out.println(pointer.next());
        }
    }
}
