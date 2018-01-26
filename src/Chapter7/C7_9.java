package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to display the smallest value out of ten numbers
 *
 * @author Hunter Smith
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int amountNumbers = 10;
        int tester = 0;
        double numbers[] = new double[amountNumbers];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < amountNumbers; i++) {
            numbers[i] = in.nextDouble();
        }
        Arrays.sort(numbers);
        m(numbers);
    }

    /**
     * Method to convert currency to dollars
     *
     * @param x array of ten numbers
     */
    public static void m(double[] x) {
        System.out.println("The smallest value is... " + x[0]);
    }
}
