/**
 * MatrixPractice.java
 * COP2250 - Week 9 Lab
 *
 * Practice declaring, filling, and processing two-dimensional arrays.
 * Complete each TODO section below.
 */

import java.util.Scanner;

public class MatrixPractice {

    // ========================================
    // PART 1: CREATE AND PRINT
    // ========================================

    // TODO 1: Define a method called "fillMatrix" that takes a Scanner,
    //         an int rows, and an int cols.
    //         Read (rows * cols) doubles from the user and return the 2D array.
    //         Signature: public static double[][] fillMatrix(Scanner input, int rows, int cols)
    //
    //         Steps inside:
    //         - Create a new double[][] of size [rows][cols]
    //         - Use a nested loop: outer = rows, inner = cols
    //         - Prompt "[row][col]: " for each element
    //         - Return the filled matrix
    public static double[][] fillMatrix(Scanner input, int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextDouble();
            }
        }

        return matrix;
    }

    // TODO 2: Define a void method called "printMatrix" that takes a double[][]
    //         and prints the matrix row by row.
    //         Signature: public static void printMatrix(double[][] m)
    //
    //         Output format: each element right-aligned in a 6-character field
    //         Hint: System.out.printf("%6.1f", m[i][j]);
    public static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%6.1f", m[i][j]);
            }
            System.out.println();
        }
    }

    // ========================================
    // PART 2: ROW AND COLUMN OPERATIONS
    // ========================================

    // TODO 3: Define a method called "sumRow" that takes a double[][]
    //         and an int rowIndex, returns the sum of that row.
    //         Signature: public static double sumRow(double[][] m, int rowIndex)
    //
    //         Hint: loop over all columns in the given row
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0.0;
        for (int j = 0; j < m[rowIndex].length; j++) {
            sum += m[rowIndex][j];
        }
        return sum;
    }

    // TODO 4: Define a method called "sumColumn" that takes a double[][]
    //         and an int columnIndex, returns the sum of that column.
    //         Signature: public static double sumColumn(double[][] m, int columnIndex)
    //
    //         Hint: fix the column index, loop over all ROWS
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    // ========================================
    // PART 3: WHOLE MATRIX OPERATIONS
    // ========================================

    // TODO 5: Define a method called "total" that takes a double[][]
    //         and returns the sum of ALL elements in the matrix.
    //         Signature: public static double total(double[][] m)
    //
    //         Hint: use a nested loop OR call sumRow for each row
    public static double total(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += sumRow(m, i);
        }
        return sum;
    }

    // TODO 6: Define a method called "maxValue" that takes a double[][]
    //         and returns the largest element in the entire matrix.
    //         Signature: public static double maxValue(double[][] m)
    //
    //         Hint: initialize max to m[0][0], then check every element
    public static double maxValue(double[][] m) {
        double max = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        return max;
    }

    // ========================================
    // PART 4: MAIN
    // ========================================

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        System.out.println("Enter values for a " + rows + "x" + cols + " matrix:");

        // TODO 7a: Call fillMatrix to get a 3x4 matrix from the user
        double[][] matrix = fillMatrix(input, rows, cols);
        // TODO 7b: Print a blank line, then print the matrix using printMatrix
        System.out.println();
        printMatrix(matrix);
        // TODO 7c: Print the sum of each row using sumRow
        for (int i = 0; i < rows; i++) {
            System.out.printf("Sum of row %d: %.1f%n", i, sumRow(matrix, i));
        }
        // TODO 7d: Print the sum of each column using sumColumn
        for (int j = 0; j < cols; j++) {
            System.out.printf("Sum of column %d: %.1f%n", j, sumColumn(matrix, j));
        }
        // TODO 7e: Print the total and max using your methods
        System.out.printf("Total: %.1f%n", total(matrix));
        System.out.printf("Max value: %.1f%n", maxValue(matrix));

        input.close();
    }
}
