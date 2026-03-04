/**
 * ArrayPractice.java
 * COP2250 - Week 8 Lab
 * 
 * Practice declaring, filling, and processing arrays.
 * Complete each TODO section below.
 */

import java.util.Scanner;

public class ArrayPractice {

    // ========================================
    // PART 1: FILL AND PRINT
    // ========================================

    // TODO 1: Define a method called "fillArray" that takes a Scanner and
    //         an int n, reads n doubles from the user, and returns the array.
    //         Signature: public static double[] fillArray(Scanner input, int n)
    //
    //         Steps inside:
    //         - Create a new double array of size n
    //         - Loop from 0 to n, prompt "Score X: " and read into array
    //         - Return the array
    public static double[] fillArray(Scanner input, int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            arr[i] = input.nextDouble();
        }
        return arr;
    }

    // TODO 2: Define a void method called "printArray" that takes a double[]
    //         and prints each element with its index.
    //         Signature: public static void printArray(double[] arr)
    //
    //         Output format: [0]: 85.0
    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "]: " + arr[i]);
        }
    }

    // ========================================
    // PART 2: COMPUTE
    // ========================================

    // TODO 3: Define a method called "sum" that takes a double[]
    //         and returns the sum of all elements.
    //         Signature: public static double sum(double[] arr)
    public static double sum(double[] arr) {
        double total = 0;
        for (double num : arr) {
            total += num;
        }
        return total;
    }

    // TODO 4: Define a method called "average" that takes a double[]
    //         and returns the average.
    //         Signature: public static double average(double[] arr)
    //         Hint: Use your sum() method!
    public static double average(double[] arr) {
        if (arr.length == 0) {
            return 0; // Avoid division by zero
        }
        return sum(arr) / arr.length;
    }

    // TODO 5: Define a method called "max" that takes a double[]
    //         and returns the largest element.
    //         Signature: public static double max(double[] arr)
    //         Hint: Start with arr[0], loop from index 1
    public static double max(double[] arr) {
        if (arr.length == 0) {
            return Double.NEGATIVE_INFINITY; // No elements, return smallest possible
        }
        double maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // TODO 6: Define a method called "min" that takes a double[]
    //         and returns the smallest element.
    //         Signature: public static double min(double[] arr)
    //         Hint: Start with arr[0], loop from index 1
    public static double min(double[] arr) {
        if (arr.length == 0) {
            return Double.POSITIVE_INFINITY; // No elements, return largest possible
        }
        double minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    // ========================================
    // PART 3: SEARCH AND COUNT
    // ========================================

    // TODO 7: Define a method called "countAbove" that takes a double[]
    //         and a double threshold, returns how many elements are above it.
    //         Signature: public static int countAbove(double[] arr, double threshold)
    public static int countAbove(double[] arr, double threshold) {
        int count = 0;
        for (double num : arr) {
            if (num > threshold) {
                count++;
            }
        }
        return count;
    }

    // TODO 8: Define a method called "contains" that takes a double[]
    //         and a double target, returns true if target is in the array.
    //         Signature: public static boolean contains(double[] arr, double target)
    public static boolean contains(double[] arr, double target) {
        for (double num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }                    

    // ========================================
    // MAIN METHOD
    // ========================================

    public static void main(String[] args) {

        // TODO 9: Test all your methods.
        //
        // Suggested flow:
        //   Scanner input = new Scanner(System.in);
        //   System.out.print("How many scores? ");
        //   int n = input.nextInt();
        //   double[] scores = fillArray(input, n);
        //   System.out.println();
        //   printArray(scores);
        //   System.out.println();
        //   System.out.println("Sum: " + sum(scores));
        //   System.out.println("Average: " + average(scores));
        //   System.out.println("Max: " + max(scores));
        //   System.out.println("Min: " + min(scores));
        //   System.out.println("Above 90: " + countAbove(scores, 90));
        //   System.out.println("Contains 78.0: " + contains(scores, 78.0));
        //   System.out.println("Contains 99.0: " + contains(scores, 99.0));
        //   input.close();
        Scanner input = new Scanner(System.in);
        System.out.print("How many scores? ");
        int n = input.nextInt();
        double[] scores = fillArray(input, n);
        System.out.println();
        printArray(scores);
        System.out.println();
        System.out.println("Sum: " + sum(scores));
        System.out.println("Average: " + average(scores));
        System.out.println("Max: " + max(scores));
        System.out.println("Min: " + min(scores));
        System.out.println("Above 90: " + countAbove(scores, 90));
        System.out.println("Contains 78.0: " + contains(scores, 78.0));
        System.out.println("Contains 99.0: " + contains(scores, 99.0));
        input.close();  
    }

    // ========================================
    // DONE? YOU'RE READY FOR ASSIGNMENT 7
    // ========================================
    // Once this lab compiles and runs correctly,
    // move on to Assignment 7: Grade by Curve
    //
    // cd ~/scf-java-labs/assignments/assignment7-grades
    // micro GradeByBestScore.java
    //
    // You'll use the same skills:
    //   - Create an array from user input
    //   - Loop to find the max (best score)
    //   - Loop again to assign grades on a curve
    // ========================================
}
