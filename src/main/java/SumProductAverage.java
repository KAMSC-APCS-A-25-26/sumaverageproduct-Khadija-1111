/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        // TODO
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSyeda Khadija\nAPCS-A\nLewis 2.2-2.3 Arithmetic Program\n\n");

    // prompts the user for the number of times the program will run
        System.out.print("Enter the number of runs:  ");
        int numRuns = sc.nextInt();

    // runs the program for a number of times given by the user
        for(int j=0; j<numRuns; j++)
        {
            // prompts the user for three numbers and stores their values into variables
            System.out.print("\n\nEnter three numbers:  ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            // calculates the average, sum, and product of the three numbers
            double average = (num1 + num2 + num3) / 3;
            double sum = (num1 + num2 + num3);
            double product = (num1 * num2 * num3);

            // prints out the average, sum, and product
            System.out.println("\nYour average is " + average);
            System.out.println("Your sum is " + sum);
            System.out.println("Your product is " + product);
        }
    }
}
