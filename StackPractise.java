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