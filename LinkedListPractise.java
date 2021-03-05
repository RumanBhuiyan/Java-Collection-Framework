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