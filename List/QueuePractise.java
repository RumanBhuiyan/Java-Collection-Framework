import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Iterator;

public class QueuePractise {
    public static void main(String[] args) {

        // LinkedList implementation of Queue
        Queue<String> country = new LinkedList<String>();

        // Array implementation of Queue
        //Queue<String> animal2 = new ArrayDeque<String>();

        // Priority Queue implementation of Queue
        //Queue<String> animal3 = new PriorityQueue<String>();

        //Adding items
        country.offer("Bangladesh");
        country.add("India");
        country.add("London");
        country.add("japan");

        //Removing items
        country.remove();//Removes the first element

        //Iterating 
        //process: 01
        country.forEach((item) -> {
            System.out.println(item);
        });
        // process :02
        for (String keep : country) {
            System.out.println(keep);
        }
        // Process : 03
        Iterator pointer = country.iterator();

        while (pointer.hasNext()) {
            System.out.println(pointer.next());
        }
    }
}
