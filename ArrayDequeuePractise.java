import java.util.ArrayDeque;

public class ArrayDequeuePractise {
    
    public static void main(String[] args) {
        
        //Declaring Deque 
        ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();

        //Adding items
        numbers.add(3);
        numbers.addFirst(2);
        numbers.addLast(4);
        

        numbers.offer(6);//offer simply inserts like add 
        numbers.addFirst(5);
        numbers.addLast(8);

        //Accessing items not removing
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        System.out.println(numbers);

        // Accessing items not removing
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());
        System.out.println(numbers.peek());

        System.out.println(numbers);

        // returns items & remove also
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());

        System.out.println(numbers);

        //removing items
        System.out.println(numbers.remove());
        System.out.println(numbers.remove(3));

        System.out.println(numbers);
    }
}
