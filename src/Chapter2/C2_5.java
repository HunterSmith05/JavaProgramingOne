package Chapter2;

import java.util.Scanner;

/**
 * Program to display takes user input which then converts it into gratuity and
 * total cost to the console
 *
 * @author Hunter Smith
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("What is your subtotal..?");
        double subtotal = in.nextDouble();
        System.out.println("What is your percent gratuity..?");
        double gratuity = in2.nextDouble();
        double g = (gratuity / 100) * subtotal;
        double total = subtotal + g;
        System.out.println("Your gratuity is..." + g + " Your new total is..." + total);

    }

}
