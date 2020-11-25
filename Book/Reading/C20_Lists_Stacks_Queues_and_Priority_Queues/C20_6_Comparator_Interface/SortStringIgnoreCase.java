package C20_6_Comparator_Interface;

import java.util.Arrays;
import java.util.List;

public class SortStringIgnoreCase {
    
    public static void main(String[] args) {
        List<String> cities = Arrays.asList
            ("Atlanta", "Savannah", "New York", "Dallas");
        
        cities.sort(String::compareToIgnoreCase);
        /**
         * Here String::compareToIgnoreCase is known as 
         * method reference, which is equivalent to a lambda 
         * expression. The compiler automatically translates 
         * a method reference to an equivalent lambda expression.
         */
        for (String s : cities) {
            System.out.println(s + " ");
        }
    }

}
