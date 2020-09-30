package C19_7_Wildcard_Generic_Types;

import C19_3_Defining_generic_classes_and_interfaces.GenericStack;

public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1); // 1 is autoboxed into new Integer(1)
        intStack.push(2);
        intStack.push(-2);

        System.out.print("The max number is " + max(intStack));
    }

    /** 
     * The fact is Integer is a subtype of Number, 
     * but GenericStack<Integer> is not a subtype 
     * of GenericStack<Number>. 
     * So, I can fix it by using wildcard.
     */
    //public static double max(GenericStack<Number> stack) {
    public static double max(GenericStack<? extends Number> stack) {
    /**
     * <? extends Number> is a wildcard type that represents 
     * Number or a subtype of Number, so it is legal to invoke 
     * max(new GenericStack<Integer>()) or max(new GenericStack<Double>()).
     */
        double max = stack.pop().doubleValue(); // Initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}