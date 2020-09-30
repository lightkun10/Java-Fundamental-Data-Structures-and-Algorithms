package C19_5_CaseStudy_Sorting_an_Array_of_Objects;

public class GenericSort {
    public static void main(String[] args) {
        // Create an Integer array
        // Slightly different than the book, because new Integer(n) 
        // is deprecated since Java 9.
        // https://docs.oracle.com/javase/9/docs/api/java/lang/Integer.html
        Integer[] intArray = { Integer.valueOf(2), Integer.valueOf(4), 
            Integer.valueOf(3) };

        // Create a Double array
        // Also slighly different than the book, see comment above.
        Double[] doubleArray = { Double.valueOf(3.4), Double.valueOf(1.3), 
            Double.valueOf(-22.1) };
        
        // Create a Character array
        Character[] charArray = { Character.valueOf('a'), Character.valueOf('J'), 
            Character.valueOf('r') };
        
        // Create a String array
        String[] stringArray = { "Tom", "Susan", "Kim" };

        Integer[] ints = {1, 4, 2, 3, 8, 9, 5};

        // Sort the arrays
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        // Display the sorted arrays
        printList(intArray);
        printList(doubleArray);
        printList(charArray);
        printList(stringArray);
    }

    /** Sort an array of comparable objects */
    public static <E extends Comparable<E>> void sort(E[] list) {
        /*
        The generic type is defined as <E extends Comparable<E>>. 
        This has two meanings. First, it specifies that E is 
        a subtype of Comparable. Second, it specifies that
        the elements to be compared are of the E type as well.
        */
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i+1..list.length−2]
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                // To now the int result of compare
                //System.out.println(currentMin.compareTo(list[j]));

                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}