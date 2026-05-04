/**
 * Assignment13.java
 * COP 2250 - Assignment 13
 * Abstract Classes and Interfaces (Liang Ch. 13)
 *
 * Name: Duffy, Michael
 * Date: 5/4/2026
 *
 * All classes go in this one file.
 */

// -------------------------------------------------------
// STEP 1 - Colorable interface
// One method: void howToColor()
// -------------------------------------------------------
interface Colorable {
    void howToColor();
}

// -------------------------------------------------------
// STEP 2 - Abstract class GeometricObject
// private String color
// Constructor: GeometricObject(String color)
// getColor(): returns color
// abstract getArea()
// abstract getPerimeter()
// toString(): returns color, area, perimeter
// -------------------------------------------------------
abstract class GeometricObject {
    private String color;

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Color: " + color
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter();
    }
}

// -------------------------------------------------------
// STEP 3 - Circle extends GeometricObject implements Colorable
// private double radius
// Constructor: Circle(double radius, String color)
// getArea(), getPerimeter(), howToColor()
// -------------------------------------------------------
class Circle extends GeometricObject implements Colorable {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void howToColor() {
        System.out.println("Color the circle evenly around the edge.");
    }
}

// -------------------------------------------------------
// STEP 4 - Rectangle extends GeometricObject implements Colorable
// private double width, height
// Constructor: Rectangle(double width, double height, String color)
// getArea(), getPerimeter(), howToColor()
// -------------------------------------------------------
class Rectangle extends GeometricObject implements Colorable {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void howToColor() {
        System.out.println("Color the rectangle from one side to the other.");
    }
}

// -------------------------------------------------------
// STEP 5 - Main: test both classes
// Store in GeometricObject references
// Print toString() and call howToColor() on each
// -------------------------------------------------------
public class Assignment13 {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5.0, "red");
        GeometricObject r = new Rectangle(4.0, 6.0, "blue");

        System.out.println("--- Circle ---");
        System.out.println(c);
        ((Colorable) c).howToColor();

        System.out.println("\n--- Rectangle ---");
        System.out.println(r);
        ((Colorable) r).howToColor();
    }
}