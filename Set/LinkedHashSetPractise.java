// LinkedHashSet maintains insertion order but doesn't sort items

import java.util.LinkedHashSet;

public class LinkedHashSetPractise {
    
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);

        System.out.println(numbers);
    }
}
