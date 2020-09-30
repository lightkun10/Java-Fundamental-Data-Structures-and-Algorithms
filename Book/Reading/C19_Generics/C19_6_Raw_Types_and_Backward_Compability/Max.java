package C19_6_Raw_Types_and_Backward_Compability;

public class Max {
    /**
     * A generic class such as GenericStack and ArrayList 
     * used without a type parameter is called a raw type.
     * Below example of using raw types.
     */
    public static void main(String[] args) {
        Max.max("Welcome", 23); // 23 is autoboxed into new Integer(23)
    }

    /** Return the maximum of two objects */
    public static Comparable max(Comparable o1, Comparable o2) {
        /**
         * Comparable o1 and Comparable o2 are raw type 
         * declarations. Be careful: raw types are unsafe.
         */
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}