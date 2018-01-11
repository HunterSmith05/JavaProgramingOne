package Chapter3;

import java.util.Scanner;

/**
 * Program takes user input to compute which number is less than, greater than,
 * or if both numbers are equal then prints the results to the console
 *
 * @author Hunter Smith
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your first number...");
        double num1 = in.nextDouble();
        System.out.println("What is your second number...");
        double num2 = in.nextDouble();
        if (num1 < num2) {
            System.out.println("The first number is less than the second...");
        }

        if (num1 > num2) {
            System.out.println("The first number is greater than the second...");
        }

        if (num1 == num2) {
            System.out.println("The first number is equal to the second");
        }

        if (num1 <= num2) {
            System.out.println("The first number is less than or equal to the second");
        }

        if (num1 != num2) {
            System.out.println("The first number is not equal to the second");
        }

        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (num1 / num2 < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("improper fraction");
        }

        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (num1 >= 1 && num2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }

}
