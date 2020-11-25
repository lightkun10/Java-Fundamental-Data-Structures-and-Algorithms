package C20_5_Lists;

import java.util.*;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10); // index 0, add 10
        arrayList.add(3, 30); // index 3, add 30

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1, "red"); // index 1, add "red"
        linkedList.removeLast(); // Returns and removes the last element from this list
        linkedList.addFirst("green"); // Adds "green" to the head of this list


        System.out.println("Display the linked list forward:");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Display the linked list backward:");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        /**
         * Java provides the static asList method for creating a list 
         * from a variable-length list of arguments. Thus, you can use 
         * the following code to create a list of strings and a list 
         * of integers:
         */
        List<String> list1 = Arrays.asList("red", "green", "blue");
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);

    }
}
