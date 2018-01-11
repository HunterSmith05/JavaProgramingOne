package Chapter3;

import java.util.Scanner;

/**
 * Program takes user input to calculate the best price for a package then
 * displays the results to the console
 *
 * @author Hunter Smith
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the weight of the first package...");
        double weight1 = in.nextDouble();
        System.out.println("What is the price of the first package...");
        double price1 = in.nextDouble();
        System.out.println("What is the weight of the second package...");
        double weight2 = in.nextDouble();
        System.out.println("What is the price of the second package...");
        double price2 = in.nextDouble();
        double math1 = price1 / weight1;
        double math2 = price2 / weight2;
        if (math1 < math2) {
            System.out.println("Package 1 has a better price");
        } else if (math2 < math1) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("The packages have the same price");
        }
    }
}
