/**
 * Duffy_11_1.java
 * COP 2250 - Assignment 11
 * Inheritance - Extending GeometricObject (Liang 11.1)
 *
 * Name: Duffy, Michael
 * Date: 5/4/2026
 */

import java.util.Scanner;

public class Duffy_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = input.nextDouble();

        System.out.print("Enter color: ");
        String color = input.next();

        System.out.print("Is the triangle filled? Enter true or false: ");
        boolean filled = input.nextBoolean();

        Triangle_MD triangle = new Triangle_MD(side1, side2, side3);

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\nTriangle Information:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println(triangle.toString());

        input.close();
    }
}

class Triangle_MD extends GeometricObject {

    // -------------------------------------------------------
    // STEP 1 - Declare three private double fields:
    //          side1, side2, side3
    // -------------------------------------------------------
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // -------------------------------------------------------
    // STEP 2 - Default constructor
    // All three sides default to 1.0
    // Must call super()
    // -------------------------------------------------------
    public Triangle_MD() {
        super();
    }

    // -------------------------------------------------------
    // STEP 3 - Parameterized constructor
    // Accepts side1, side2, side3
    // Must call super() — no color/filled required
    // -------------------------------------------------------
    public Triangle_MD(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // -------------------------------------------------------
    // STEP 4 - Getters for side1, side2, side3
    // No setters required
    // -------------------------------------------------------
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // -------------------------------------------------------
    // STEP 5 - getPerimeter()
    // Sum of all three sides
    // -------------------------------------------------------
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // -------------------------------------------------------
    // STEP 6 - getArea()
    // Return 0 because this assignment only needs it to inherit GeometricObject.
    // -------------------------------------------------------
    public double getArea() {
        return 0;
    }

    // -------------------------------------------------------
    // STEP 7 - toString()
    // Return a string description for the triangle.
    // -------------------------------------------------------
    public String toString() {
        return "Triangle: side1 = " + side1
                + " side2 = " + side2
                + " side3 = " + side3;
    }
}