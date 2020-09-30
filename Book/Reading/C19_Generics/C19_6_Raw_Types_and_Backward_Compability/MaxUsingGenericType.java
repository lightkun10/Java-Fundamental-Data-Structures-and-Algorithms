package C19_6_Raw_Types_and_Backward_Compability;

import java.util.ArrayList;

import C19_3_Defining_generic_classes_and_interfaces.GenericStack;

public class MaxUsingGenericType {
    
    public static void main(String[] args) {

        // max("Welcome", 23); // compile error displayed
        /**
         * two arguments must have the same type 
         * (e.g., two strings or two integer objects). 
         * Furthermore, the type E must be a subtype of Comparable<E>.
         */

        max("Welcome", "Hello");

        GenericStack stack; // declared as a raw type, should be parameterized...
        stack = new GenericStack<String>();  // assign stack to GenericStack<String>
        stack.push("Welcome to Java");  // compiler knows that stack is a raw type
        stack.push(Integer.valueOf(2)); // so certain operations is unsafe

        System.out.println(stack);  // NOTE this is UNSAFE 

        ArrayList list = new ArrayList();   // NOTE unsafe, a raw type ArrayList
    }
    
    /** Return the maximum of two objects */
    public static <E extends Comparable<E>> E max (E o1, E o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        else {
            return o2;
        }
    }

    /** Return the minimum of two objects */
    public static <E extends Comparable<E>> E min (E o1, E o2) {
        if (o1.compareTo(o2) < 0) {
            return o1;
        }
        else {
            return o2;
        }
    }
}