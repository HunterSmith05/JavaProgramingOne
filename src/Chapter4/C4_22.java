package Chapter4;

import java.util.Scanner;

/**
 * Program takes user input to decide if the two strings are the same and then
 * outputs it to the console
 *
 * @author Hunter Smith
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your first string?");
        String strn1 = in.nextLine();
        System.out.println("What is your next string?");
        String strn2 = in.nextLine();
        if (strn1.toLowerCase().contains(strn2.toLowerCase())) {
            System.out.println("good");
        } else {
            System.out.println("Bad");
        }
    }
}
