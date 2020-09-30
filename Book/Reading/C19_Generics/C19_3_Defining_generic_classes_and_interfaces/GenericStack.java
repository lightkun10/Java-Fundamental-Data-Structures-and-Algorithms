package C19_3_Defining_generic_classes_and_interfaces;

import java.util.ArrayList;

public class GenericStack<E> {  // generic type E declared
    
    // Instance variable
    private ArrayList<E> list;  // generic array list

    // Constructor
    public GenericStack() {
        this.list = new ArrayList<>();
    }

    public int getSize() {  // getSize
        return list.size();
    }

    public E peek() {   // peek
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {    // pop
        E o = list.get(this.getSize() - 1); // Get the last item in list
        list.remove(this.getSize() - 1); // remove the last item in list
        return o;   // return the last item in list that is saved as variable
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + this.list.toString();
    }
}
