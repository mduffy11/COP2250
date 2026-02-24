/**
 * MethodPractice.java
 * COP2250 - Week 7 Lab
 * 
 * Practice defining, calling, and returning values from methods.
 * Complete each TODO section below.
 */

public class MethodPractice {

    // ========================================
    // PART 1: VALUE-RETURNING METHODS
    // ========================================

    // TODO 1: Define a method called "max" that takes two ints
    //         and returns the larger one.
    //         Signature: public static int max(int a, int b)
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    // TODO 2: Define a method called "min" that takes two ints
    //         and returns the smaller one.
    //         Signature: public static int min(int a, int b)
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
    // TODO 3: Define a method called "average" that takes three doubles
    //         and returns their average.
    //         Signature: public static double average(double a, double b, double c)
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    // ========================================
    // PART 2: VOID METHODS
    // ========================================

    // TODO 4: Define a void method called "printStars" that takes an int n
    //         and prints a single line of n asterisks.
    //         Example: printStars(5) prints *****
    //         Hint: Use a for loop, then println() at the end
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // TODO 5: Define a void method called "printBox" that takes width and height
    //         and prints a rectangle of asterisks.
    //         Example: printBox(4, 3) prints:
    //         ****
    //         ****
    //         ****
    //         Hint: Call printStars() inside a loop
    public static void printBox(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    // ========================================
    // PART 3: PUTTING IT TOGETHER
    // ========================================

    // TODO 6: Define a method called "isEven" that takes an int
    //         and returns true if it's even, false otherwise.
    //         Signature: public static boolean isEven(int n)
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // TODO 7: Define a method called "factorial" that takes a non-negative int
    //         and returns its factorial (n! = n * (n-1) * ... * 1).
    //         factorial(0) = 1, factorial(5) = 120
    //         Signature: public static int factorial(int n)
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ========================================
    // MAIN METHOD - Test your methods here
    // ========================================

    public static void main(String[] args) {

        // TODO 8: Test all your methods below.
        //         Print results with labels so output is clear.
        //
        // Example calls:
        System.out.println("max(5, 3) = " + max(5, 3));
        System.out.println("min(5, 3) = " + min(5, 3));
        System.out.println("average(80, 90, 100) = " + average(80, 90, 100));
        System.out.print("printStars(5) = ");
        printStars(5);
        System.out.println("printBox(3, 3) = ");
        printBox(3, 3);
        System.out.println("isEven(4) = " + isEven(4));
        System.out.println("isEven(7) = " + isEven(7));
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(0) = " + factorial(0));

    }
}
