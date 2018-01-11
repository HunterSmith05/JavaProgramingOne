package Chapter5;

import java.util.Scanner;

/**
 * Program is use to count votes and print the results.
 *
 * @author Hunter Smith
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean input = false;
        int yes = 0;
        int no = 0;
        while (input == false) {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            String s1 = in.nextLine();

            if (s1.equals("y") || s1.equals("Y")) {
                yes = yes + 1;
                input = false;
            } else if (s1.equals("n") || s1.equals("N")) {
                no = no + 1;
                input = false;
            } else if (s1.equals("q") || s1.equals("Q")) {

                input = true;
            } else {
                System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
                input = false;
            }
        }
        System.out.println("There are " + yes + " votes for yes and " + no + " votes for no");
    }
}
