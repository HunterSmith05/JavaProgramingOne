package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to display the average of an array
 *
 * @author Hunter Smith
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers will be in the array..?");
        int amount = in.nextInt();
        int[] array = new int[amount];
        method1(array, in);
        System.out.println("The average is " + method2(array));
        method3(array);

    }

    /**
     * Method to convert currency to dollars
     *
     * @param array array of ten numbers
     * @param in array of ten numbers *
     */
    public static void method1(int[] array, Scanner in) {
        double sum = 0;
        System.out.println("What are the numbers...");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();

        }

    }

    /**
     * Method to convert currency to dollars
     *
     * @param array array of numbers
     * @return the average
     */
    public static double method2(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return (sum / array.length);
    }

    /**
     * Method to convert currency to dollars
     *
     * @param array array of numbers
     */
    public static void method3(int[] array) {
        System.out.println(Arrays.toString(array));

    }

}
