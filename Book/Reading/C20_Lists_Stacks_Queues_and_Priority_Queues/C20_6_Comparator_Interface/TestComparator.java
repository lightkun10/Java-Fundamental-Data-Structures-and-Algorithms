package C20_6_Comparator_Interface;

import C20_6_Comparator_Interface.oldclasses.*;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 = new Circle(5);

        // GeometricObject g = max(g1, g2, new GeometricObjectComparator());
        // System.out.println("The area of the larger object is " + g.getArea());

        /**
         * Since the Comparator interface is a single abstract 
         * method interface, I can use a lambda expression to 
         * simplify the program
         */
        max(g1, g2, (o1, o2) -> o1.getArea() > o2.getArea() ?
            1 : o1.getArea() == o2.getArea() ? 0 : -1);
        /**
         * Here, o1 and o2 are two parameters in the 
         * compare method in the Comparator interface.
         * The method returns 1 if o1.getArea() > o2.getArea(), 
         * 0 if o1.getArea() == o2.getArea(), and −1 otherwise.
         */
    }

    public static GeometricObject max(GeometricObject g1, GeometricObject g2, 
                                        Comparator<GeometricObject> c) {
        
        if (c.compare(g1, g2) > 0) {
            return g1;
        }
        else {
            return g2;
        }
    }
    
}
