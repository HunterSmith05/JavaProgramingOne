package Chapter5;

import java.util.Scanner;

/**
 * Program reverse a string entered by the user
 *
 * @author Hunter Smith
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        String s1 = in.nextLine();
        System.out.println("The reversed string is " + (new StringBuffer(s1).reverse().toString()));
    }
}
