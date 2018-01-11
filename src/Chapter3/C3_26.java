package Chapter3;

import java.util.Scanner;

/**
 * Program takes user input and checks if it is applicable to any conditions
 * then it displays the results to the console
 *
 * @author Hunter Smith
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your integer...");
        int x = in.nextInt();
        if (x % 5 == 0 && x % 6 == 0) {
            System.out.println("Your number is divisible by 5 and 6: True");
        } else {
            System.out.println("Your number is divisible by 5 and 6: False");
        }
        if (x % 5 == 0 || x % 6 == 0) {
            System.out.println("Your number is divisible by 5 or 6: True");
        } else {
            System.out.println("Your number is divisible by 5 or 6: False");
        }
        if (x % 5 == 0 ^ x % 6 == 0) {
            System.out.println("Your number is divisible by 5 or 6 , but not both: True");
        } else {
            System.out.println("Your number is divisible by 5 or 6 ,but not both: False");
        }

    }
}
