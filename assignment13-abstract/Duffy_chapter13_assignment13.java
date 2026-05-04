/**
 * Duffy_chapter13_assignment13.java
 * COP 2250 - Assignment 13
 * Abstract Classes and Interfaces (Liang Ch. 13)
 *
 * Name: Duffy, Michael
 * Date: 5/4/2026
 *
 * All classes go in this one file.
 */

import java.util.Scanner;

// -------------------------------------------------------
// STEP 5 - Main: test all three classes
// Prompt the user for values, create objects, display results,
// and compare area and perimeter using GeometricObject references.
// -------------------------------------------------------
public class Duffy_chapter13_assignment13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter rectangle width: ");
            double width = input.nextDouble();

            System.out.print("Enter rectangle height: ");
            double height = input.nextDouble();

            System.out.print("Enter rectangle color: ");
            String rectangleColor = input.next();

            System.out.print("Is the rectangle filled? Enter true or false: ");
            boolean rectangleFilled = input.nextBoolean();

            Rectangle_MD rectangle = new Rectangle_MD(width, height);
            rectangle.setColor(rectangleColor);
            rectangle.setFilled(rectangleFilled);

            System.out.print("Enter circle radius: ");
            double radius = input.nextDouble();

            System.out.print("Enter circle color: ");
            String circleColor = input.next();

            System.out.print("Is the circle filled? Enter true or false: ");
            boolean circleFilled = input.nextBoolean();

            Circle_MD circle = new Circle_MD(radius);
            circle.setColor(circleColor);
            circle.setFilled(circleFilled);

            System.out.print("Enter triangle side 1: ");
            double side1 = input.nextDouble();

            System.out.print("Enter triangle side 2: ");
            double side2 = input.nextDouble();

            System.out.print("Enter triangle side 3: ");
            double side3 = input.nextDouble();

            System.out.print("Enter triangle color: ");
            String triangleColor = input.next();

            System.out.print("Is the triangle filled? Enter true or false: ");
            boolean triangleFilled = input.nextBoolean();

            Triangle_MD triangle = new Triangle_MD(side1, side2, side3);
            triangle.setColor(triangleColor);
            triangle.setFilled(triangleFilled);

            GeometricObject rectangleObject = rectangle;
            GeometricObject circleObject = circle;
            GeometricObject triangleObject = triangle;

            System.out.println("\n--- Rectangle ---");
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
            System.out.println("Color: " + rectangle.getColor());
            System.out.println("Filled: " + rectangle.isFilled());

            System.out.println("\n--- Circle ---");
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());
            System.out.println("Color: " + circle.getColor());
            System.out.println("Filled: " + circle.isFilled());

            System.out.println("\n--- Triangle ---");
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());

            System.out.println("\n--- Area Comparison ---");
            compareArea(rectangleObject, circleObject);

            System.out.println("\n--- Perimeter Comparisons ---");
            comparePerimeter(rectangleObject, circleObject);
            comparePerimeter(rectangleObject, triangleObject);
            comparePerimeter(circleObject, triangleObject);
        }
        catch (Exception ex) {
            // Use try/catch to handle invalid user input without crashing the program.
            System.out.println("Invalid input. Please restart the program and enter the correct data type.");
        }

        input.close();
    }

    public static void compareArea(GeometricObject object1, GeometricObject object2) {
        if (object1.getArea() == object2.getArea()) {
            System.out.println("The rectangle and circle have equal areas.");
        }
        else {
            System.out.println("The rectangle and circle do not have equal areas.");
        }
    }

    public static void comparePerimeter(GeometricObject object1, GeometricObject object2) {
        if (object1.getPerimeter() == object2.getPerimeter()) {
            System.out.println("The two objects have equal perimeters.");
        }
        else {
            System.out.println("The two objects do not have equal perimeters.");
        }
    }
}

// -------------------------------------------------------
// STEP 2 - Abstract class GeometricObject
// private String color
// private boolean filled
// getColor(): returns color
// setColor(): sets color
// isFilled(): returns filled
// setFilled(): sets filled
// abstract getArea()
// abstract getPerimeter()
// -------------------------------------------------------
abstract class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

// -------------------------------------------------------
// STEP 4 - Rectangle extends GeometricObject
// private double width, height
// Constructor: Rectangle_MD(double width, double height)
// getArea(), getPerimeter()
// -------------------------------------------------------
class Rectangle_MD extends GeometricObject {
    private double width;
    private double height;

    public Rectangle_MD(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// -------------------------------------------------------
// STEP 3 - Circle extends GeometricObject
// private double radius
// Constructor: Circle_MD(double radius)
// getArea(), getPerimeter()
// -------------------------------------------------------
class Circle_MD extends GeometricObject {
    private double radius;

    public Circle_MD(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// -------------------------------------------------------
// Triangle extends GeometricObject
// private double side1, side2, side3
// Constructor: Triangle_MD(double side1, double side2, double side3)
// getArea(), getPerimeter()
// -------------------------------------------------------
class Triangle_MD extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle_MD(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}