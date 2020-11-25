package C20_6_Comparator_Interface;

import C20_6_Comparator_Interface.oldclasses.GeometricObject;
import java.util.Comparator;
import java.io.Serializable;

/**
 * It is generally good idea for comparators to 
 * implement Serializable so they can be serialized.
 */
public class GeometricObjectComparator 
    implements Comparator<GeometricObject>, Serializable { // implements Comparator

    public int compare(GeometricObject o1, GeometricObject o2) { // implements compare
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }

    }
    
}
