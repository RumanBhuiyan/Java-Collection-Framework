//Treeset is similar as Hashset but the only difference is
// Treeset keeps its items in ascending order 

import java.util.TreeSet;

public class TreeSetPractise {
   
    public static void main(String[] args) {
        
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers);// 2 4 5 6
    }
}
