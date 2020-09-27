package C20_3_Iterators;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        /* Creates a concrete collection object using ArrayList */
        Collection<String> collection = new ArrayList<String>();

        /* Adds four strings into the list */
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        /* Obtains an iterator for the collection */
        Iterator<String> iterator = collection.iterator();

        /* 
        Uses the iterator to traverse all the strings in 
        the list and displays the strings in uppercase 
        */
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();

        /* Alternative way, using foreach loop */
        System.out.println("\nAlternative way, using foreach loop:");
        for (String element : collection) {
            System.out.print(element.toUpperCase() + " ");
        }
    }
}