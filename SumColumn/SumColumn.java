/**
 * SumColumn.java
 * COP2250 - Assignment 8 (Exercise 8.1)
 * 
 * Duffy, Michael
 * 3/24/2026
 *
 * Write a method that returns the sum of all elements in a
 * specified column in a matrix. Write a test program that
 * reads a 3-by-4 matrix and displays the sum of each column.
 *
 * A method that returns the sum of all elements in a specified column in a matrix.
 * 
 * DIRECTIONS: Follow each STEP below. Do them in order.
 *             Compile and test after each STEP.
 */

import java.util.Scanner;

public class SumColumn {

    // ========================================
    // STEP 1: Write the sumColumn method
    // ========================================
    // Use this exact header:
    //
    // public static double sumColumn(double[][] m, int columnIndex) {
    //     double sum = 0;
    //     for (int i = 0; i < m.length; i++) {
    //         sum += m[i][columnIndex];
    //     }
    //     return sum;
    // }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {

        // STEP 2: Create a Scanner
        // Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // STEP 3: Declare a 3-by-4 matrix
        // double[][] m = new double[3][4];
        double[][] m = new double[3][4];

        // STEP 4: Prompt and read the matrix row by row
        // System.out.println("Enter a 3-by-4 matrix row by row:");
        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m[0].length; j++) {
        //         m[i][j] = input.nextDouble();
        //     }
        // }
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        // STEP 5: Display the sum of each column
        // for (int col = 0; col < m[0].length; col++) {
        //     System.out.println("Sum of column " + col + " is " + sumColumn(m, col));
        // }
        for (int col = 0; col < m[0].length; col++) {
            System.out.println("Sum of column " + col + " is " + sumColumn(m, col));
        }

        // STEP 6: Close the Scanner
        // input.close();
        input.close();
    }

    // ========================================
    // STEP 7: Compile and test
    // ========================================
    // javac SumColumn.java
    // java SumColumn
    //
    // Test case 1:
    //   Enter a 3-by-4 matrix row by row:
    //   1 2 3 4
    //   5 6 7 8
    //   9 10 11 12
    //   Expected:
    //     Sum of column 0 is 15.0
    //     Sum of column 1 is 18.0
    //     Sum of column 2 is 21.0
    //     Sum of column 3 is 24.0
    //
    // Test case 2:
    //   Enter a 3-by-4 matrix row by row:
    //   0 1 2 3
    //   0 1 2 3
    //   0 1 2 3
    //   Expected:
    //     Sum of column 0 is 0.0
    //     Sum of column 1 is 3.0
    //     Sum of column 2 is 6.0
    //     Sum of column 3 is 9.0

    // ========================================
    // STEP 8: Add a header comment
    // ========================================
    // Your name, date, description

    // ========================================
    // STEP 9: Push to your repo
    // ========================================
    // git add SumColumn.java
    // git commit -m "Assignment 8 - Sum Column"
    // git push

}
