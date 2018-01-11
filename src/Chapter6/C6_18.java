package Chapter6;

import java.util.Scanner;

/**
 * Program checks to see if a entered password is allowed or not.
 *
 * @author Hunter Smith
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your password?");
        String password = in.nextLine();
        int counter = 0;
        if (password.length() >= 8) {
            counter = 1;
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    counter = 1;
                    break;
                }
                if (Character.isLetterOrDigit(password.charAt(i))) {
                    counter = 2;

                }
            }
            for (int x = 0; x < password.length(); x++) {
                if (counter == 1) {
                    break;
                }
                if (!Character.isDigit(password.charAt(x))) {
                    counter = 2;
                }
                if (Character.isDigit(password.charAt(x))) {
                    counter = 3;
                }
            }
        }
        if (counter == 3) {
            System.out.println("Valid Password");
        }
        if (counter == 0) {
            System.out.println("Password must be at least eight digits");
            System.out.println("Invalid Password");
        }
        if (counter == 1) {
            System.out.println("Password must only contain numbers and digits");
            System.out.println("Invalid Password");
        }
        if (counter == 2) {
            System.out.println("Password must have at least two digits");
            System.out.println("Invalid Password");
        }

    }
}
