package String_Easy;
import java.util.*;

public class JavaHungry
{
    public static void main(String[] args)
    {
        // Create listOfLists in Java
        List<List<String>> listOfLists = new ArrayList<>();

        // Creating innerList
        List<String> innerList = new ArrayList<>();

        // Adding elements to innerList
        innerList.add("Boston");
        innerList.add("San Francisco");
        innerList.add("New York");

        // Adding innerList to listOfLists
        listOfLists.add(innerList);

        // Creating another inner list
        List<String> innerList2 = new ArrayList<>();

        // Adding elements to innerList2
        innerList2.add("LinkedIn");
        innerList2.add("Twitter");
        innerList2.add("Facebook");

        // Adding innerList2 to listOfLists
        listOfLists.add(innerList2);

        // Printing listOfLists elements
        System.out.println(listOfLists);
    }
}