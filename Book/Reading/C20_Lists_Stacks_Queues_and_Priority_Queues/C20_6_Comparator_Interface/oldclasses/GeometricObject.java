package C20_6_Comparator_Interface.oldclasses;

import java.util.Date;

public abstract class GeometricObject {
    // Data fields/Instance Variable
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {  // constructor
        dateCreated = new Date();   // date constructed
    }

    /** Construct a geometric object with the 
      * specified color and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
        its getter method is named isFilled */
    public boolean isFilled() {
        return this.filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
            " and filled: " + filled;
    }

    /* Abstract method getArea */
    public abstract double getArea();

    /* Abstract method getPerimeter */
    public abstract double getPerimeter();
}
