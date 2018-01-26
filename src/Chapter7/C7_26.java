package Chapter7;

import java.util.Scanner;

/**
 * Program tests two strings
 *
 * @author Hunter Smith
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your first array...");
        int array1[] = new int[in.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = in.nextInt();
        }

        System.out.print("What is your second array...");
        int array2[] = new int[in.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = in.nextInt();
        }
        equals(array1, array2);
    }

    /**
     * Method to convert currency to dollars
     *
     * @param array1[] first array for testing
     * @param array2[] second array for testing
     * @return true or false
     */
    public static boolean equals(int array1[], int array2[]) {
        if (java.util.Arrays.equals(array1, array2)) {
            System.out.println("The two arrays are strictly identical");
            return true;
        } else {
            System.out.println("The two arrays are not strictly identical");
            return false;
        }
    }
}
