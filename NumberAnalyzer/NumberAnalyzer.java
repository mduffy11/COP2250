// ============================================
// LAB 06: Number Analyzer
// COP2250 Java Programming
// Kevin Pyatt, Ph.D. | Pyatt Labs
// ============================================

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize counters and accumulator
        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;

        // STEP 1: Priming read — get the first number BEFORE the loop
        System.out.print("Enter an integer (0 to quit): ");
        int num = input.nextInt();

        // STEP 2: Loop while the sentinel value (0) has NOT been entered
        // TODO: Write the while loop condition
        while (num != 0) {
        
            // STEP 3: Inside the loop — check if num is positive or negative
            // TODO: If positive, increment positiveCount
            if (num > 0) {
                positiveCount++;
            }
            // TODO: If negative, increment negativeCount
            else if (num < 0) {
                negativeCount++;
            }
            // STEP 4: Add num to the running total
            // TODO: Accumulate total
            total += num;

            // STEP 5: Read the next number (bottom of loop)
            System.out.print("Enter an integer (0 to quit): ");
            num = input.nextInt();
        }

        // STEP 6: After the loop — calculate and display results
        int count = positiveCount + negativeCount;

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Positive count: " + positiveCount);
            System.out.println("Negative count: " + negativeCount);
            System.out.println("Total: " + total);
            // TODO: Calculate and display the average as a floating-point number
            // Hint: cast total or count to double before dividing
            double average = (double) total / count;
            System.out.println("Average: " + average);
        }

        input.close();
    }
}
