package C20_6_Comparator_Interface;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        // Arrays.sort(cities, new MyComparator());
        
        // for (String s : cities) {
        //     System.out.print(s + " ");
        // }

        /*
        Since Comparator is a functional interface, the code 
        can be simplified using a lambda expression
        */
        Arrays.sort(cities, (s1, s2) -> s1.length() - s2.length());
    }
    
    /*
    Define a custom comparator, to compare
    objects using a different criteria
    */
    public static class MyComparator implements Comparator<String> {
        @Override   // override compare method from Comparator interface
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }
}
