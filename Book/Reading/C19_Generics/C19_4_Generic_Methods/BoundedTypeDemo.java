public class BoundedTypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 2);
        Circle circle = new Circle(2);    

        System.out.println("Same area? " + equalArea(rectangle, circle));
    }

    /*
    The bounded generic type <E extends GeometricObject> 
    specifies that E is a generic subtype of GeometricObject. 
    You must invoke equalArea by passing two instances of GeometricObject.
    */
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2)
    {
        return object1.getArea() == object2.getArea();
    }

    // NOTE An unbounded generic type <E> is the same as <E extends Object>

    // NOTE To define a generic type for a class, place it 
    // after the class name, such as GenericStack<E>. 
    // To define a generic type for a method, place the generic 
    // type before the method return type, such as <E> void max(E o1, E o2).
}
