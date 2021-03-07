## Fundamentals of Collection Framework in Java
> ## 1. Iterator 
```java
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
```
> ## 2. Set 
> ### HashSet
```java
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

```
> ### LinkedHashSet
```java
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
```
> ### TreeSet 
```java
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

```
> ## 3. Map
> ### HashMap
```java
    import java.util.HashMap;

    public class HashMapPractise {
  
    public static void main(String[] args) {
        //Declaring HashMap
        HashMap<Integer, String> country = new HashMap<>();

        //Adding items
        country.put(1,"Bangladesh");
        country.put(2,"india");
        country.put(3,"pakistan");
        country.put(4, "London");

        //Accessing value 
        System.out.println(country.get(2));
        System.out.println(country.keySet());
        System.out.println(country.values());

        //Changing item
        country.replace(4, "London", "UK");

        //removing items
        country.remove(2);//Remove value of key:2

        System.out.println(country);

        //Iterating
        country.forEach((key,value) -> {
            System.out.println("Key : "+key+" Value : "+value);
        });
    }
}
```
> ### LinkedHashMap
```java
// HashMap doesn’t maintain any order.
// TreeMap sort the entries in ascending order of keys.
// LinkedHashMap maintains the insertion order.

        import java.util.LinkedHashMap;

        public class LinkedHashMapPractise {
    
        public static void main(String[] args) {
        
        // Declaring HashMap
        LinkedHashMap<Integer, String> country = new LinkedHashMap<>();

        // Adding items
        country.put(1, "Bangladesh");
        country.put(2, "india");
        country.put(3, "pakistan");
        country.put(4, "London");

        // Accessing value
        System.out.println(country.get(2));
        System.out.println(country.keySet());
        System.out.println(country.values());

        // Changing item
        country.replace(4, "London", "UK");

        // removing items
        country.remove(2);// Remove value of key:2

        System.out.println(country);

        // Iterating
        country.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
    }
}

```
> ### TreeMap
```java
// TreeMap is simillar as HashMap only difference is its keys become
// sorted in ascending order.it has put(),replace(),remove() etc like HashMap

      import java.util.TreeMap;

      public class TreeMapPractise {
  
      public static void main(String[] args) {
        
        TreeMap<Integer, String> country = new TreeMap<>();

        country.put(2, "India");
        country.put(5, "London");
        country.put(1, "Bangladesh");
        country.put(4, "Japan");

        System.out.println(country);
    }
}

```
> ## 4.List
> ### Stack
```java

    import java.util.Stack;

    public class StackPractise {
    
    public static void main(String[] args) {
        
        Stack<String> country = new Stack<String>();

        // Pusing 
        country.push("Bangladesh");
        country.push("India");
        country.push("Canada");
        country.push("London");
        country.push("Japan");

        //Poping 
        country.pop();

        //Accessing items
        System.out.println(country.get(1));

        //Searching items
        System.out.println("Index : " + country.search("Canada"));
        System.out.println("Is the stack empty? " + country.isEmpty());
    }
}
```
> ### Queue
```java
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
        Iterator<String> pointer = country.iterator();

        while (pointer.hasNext()) {
            System.out.println(pointer.next());
        }
    }
}

```
> ### ArrayDequeue
```java
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

```
> ### Vector
```java
  import java.util.Vector;
  import java.util.Collections;

public class VectorPractise {
    
    public static void main(String[] args) {
        //Declaring Vector of Integer type linked list
        // Vector v = new Vector(3, 2); //also does the same job 
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

        //Accessing Items
        System.out.println("Second Item : "+numbers.get(1));

        // iterating through items
        for (int keep : numbers) {
            System.out.print(keep + " ");
        }
        System.out.println("\nSize : "+numbers.size());
        System.out.println("\n2 at position: " + numbers.indexOf(2));
    }
}

```
> ### ArrayList
```java
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
        System.out.println("Second Element : " + names.get(1));
        //Iterating through items
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

```
> ### LinkedList
```java
import java.util.LinkedList;

public class LinkedListPractise {
    
    public static void main(String [] args){

        LinkedList<String> teams = new LinkedList<String>();

        //Adding items to the linked list
        teams.add("Portugal");
        teams.add(1,"Zermani");
        teams.add("Koria");
        teams.add("France");
        teams.add("Itali");
        teams.addFirst("Argentina");
        teams.addLast("Brazil");

        //Removing items
        teams.remove("Koria");
        teams.remove(2);//remove element of index 2

        // getting & setting values
        String keep = teams.get(2);
        teams.set(2, "Japan");

        System.out.println(teams);
    }
} 
```
> ### Priority Queue
```java
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

```
