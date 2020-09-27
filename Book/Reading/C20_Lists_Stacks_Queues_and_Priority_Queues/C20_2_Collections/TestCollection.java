package C20_2_Collections;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        // The program creates a concrete collection object using ArrayList
        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        
        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);

        // Arraylist invokes the Collection interface’s contains method
        System.out.println("\nIs Dallas in collection1? "   // contains?
            + collection1.contains("Dallas"));

        // Arraylist invokes the Collection interface’s remove method
        collection1.remove("Dallas");

        // Arraylist invokes the Collection interface’s size method
        System.out.println("\n" + collection1.size() +
            " cities are in collection1 now");
        
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        // The program creates a copy of an array list
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone()); // clone

        // Arraylist invokes the Collection interface’s addAll method
        // Add all the elements from one collection to another collection
        c1.addAll(collection2);     // addAll

        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        // The program creates a copy of an array list
        c1 = (ArrayList<String>)(collection1.clone());

        // Arraylist invokes the Collection interface’s retainAll method
        // The retainAll method retains the elements in this
        // collection that are also present in the specified collection
        c1.retainAll(collection2);      // retainAll
        System.out.print("\nCities in collection 1 and collection2:");
        System.out.println(c1);
        
        // The program creates a copy of an array list
        c1 = (ArrayList<String>)(collection1.clone());

        // Arraylist invokes the Collection interface’s removeAll method
        // The removeAll method removes the elements from this 
        // collection that are present in the specified collection
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);

        
    }
}