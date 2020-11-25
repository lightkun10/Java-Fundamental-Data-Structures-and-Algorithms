package C20_6_Comparator_Interface.oldclasses;

public class Circle extends GeometricObject {
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) 
    {
        this.radius = radius;
        setColor(color);    // Use superclass's setter to set the value
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }
    
    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }
    
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
            " and the radius is " + radius);
    }

}
