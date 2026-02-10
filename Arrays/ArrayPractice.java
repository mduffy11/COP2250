/**
 * Week 4 Lab: Array Practice
 * 
 * COP2250 Java Programming
 * Kevin Pyatt, Ph.D. | Pyatt Labs
 * 
 * Complete the TODOs below to practice working with arrays.
 * This prepares you for Assignment 3 (Rock-Paper-Scissors).
 */

public class ArrayPractice {
    public static void main(String[] args) {
        
        // ============================================
        // PART 1: INTEGER ARRAYS
        // ============================================
        
        // TODO 1: Create an array of 5 integers representing test scores
        //         Use values: 90, 85, 78, 92, 88
        int[] scores = {90, 85, 78, 92, 88};
        
        // TODO 2: Print the first score (index 0)
        //         Expected output: "First score: 90"
        System.out.println("First score: " + scores[0]);
        
        // TODO 3: Print the last score (use .length - 1)
        //         Expected output: "Last score: 88"
        System.out.println("Last score: " + scores[scores.length -1]);
        
        // TODO 4: Calculate and print the average of all scores
        //         Hint: Use a for loop to add them up, then divide by length
        //         Expected output: "Average: 86.6"
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
        	sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("Average: " + average);
        System.out.println();
        
        // ============================================
        // PART 2: STRING ARRAYS
        // ============================================
        
        // TODO 5: Create a String array with 3 color names
        //         Use: "Red", "Green", "Blue"
        String[] colors = {"Red", "Green", "Blue"};
        
        // TODO 6: Print each color using a for loop
        //         Expected output:
        //         Color 0: Red
        //         Color 1: Green
        //         Color 2: Blue
        for (int i = 0; i < colors.length; i++) {
        	System.out.println("Color " + i + ": " + colors[i]);
        }
        System.out.println();
        // ============================================
        // PART 3: PREVIEW - ROCK PAPER SCISSORS
        // ============================================
        
        // TODO 7: Create an array for Rock-Paper-Scissors choices
        //         Use: "Scissor", "Rock", "Paper"
        String[] choices = {"Scissor", "Rock", "Paper"};
        
        // TODO 8: Print what index 0 represents
        //         Expected output: "Index 0 is: Scissor"
        System.out.println("Index 0 is: " + choices[0]);
        
        // TODO 9: Print what index 1 represents
        //         Expected output: "Index 1 is: Rock"
        System.out.println("Index 1 is: " + choices[1]);
        
        // TODO 10: Print what index 2 represents
        //          Expected output: "Index 2 is: Paper"
        System.out.println("Index 2 is: " + choices[2]);
        
        System.out.println();
        System.out.println("--- Week 4 Lab Complete! ---");
        System.out.println("You're ready for Assignment 3: Rock-Paper-Scissors");
    }
}
