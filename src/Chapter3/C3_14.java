package Chapter3;

import java.util.Scanner;

/**
 * Program takes user input to guess weather or not a coin will be heads or
 * tails and then displays the result to the console
 *
 * @author Hunter Smith
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int head = 1;
        int tail = 0;
        int result = (int) (Math.random() * 2);
        System.out.println("Heads=1 tails=0 What is your guess..?");
        int guess = in.nextInt();
        if (guess == result) {
            System.out.println("Your correct!");
        } else {
            System.out.println("You were wrong try again...");
        }

    }
}
