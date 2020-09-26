public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};

        /* invoke generic method */
        // GenericMethodDemo.<Integer>print(integers);
        // GenericMethodDemo.<String>print(strings);

        // The same as above, but compiler 
        // automatically discovers the actual type
        GenericMethodDemo.print(integers);
        GenericMethodDemo.print(strings);
    }


    /** Generic method */
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
