public class Main {
    public static void main(String[] args) {
        // Creates a stack to hold strings 
        // and adds three strings to the stack:
        GenericStack<String> stack1 = new GenericStack<String>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");

        // Creates a stack to hold integers 
        // and adds three integers to the stack
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);  // autoboxing 1 to new Integer(1)
        stack2.push(2);
        stack2.push(3);
    }
}