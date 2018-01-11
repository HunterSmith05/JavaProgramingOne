package Chapter6;

import java.util.Scanner;

/**
 * Program passes a amount of currency into a method to see how much it would
 * translate to in US currency.
 *
 * @author Hunter Smith
 */
public class P6 {

    private static Object In;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Euros will a dollar buy?");
        double europrice = in.nextDouble();
        System.out.println("How many Pound Sterling will a dollar buy?");
        double poundprice = in.nextDouble();
        System.out.println("How many Yen will a dollar buy?");
        double yenprice = in.nextDouble();
        boolean tester = false;
        double newprice = 0;
        while (tester == false) {
            System.out.println("How many dollars do you want to convert");
            double dollars = in.nextDouble();
            System.out.println("What is the type of currency do you want to exchange for E for Euros, P for Pounds, Y for Yen");
            in.nextLine();
            String type = in.nextLine();

            if (type.equals("E") || type.equals("e")) {

                newprice = europrice;

            } else if (type.equals("P") || type.equals("p")) {

                newprice = poundprice;
            } else if (type.equals("Y") || type.equals("y")) {

                newprice = yenprice;
            }
            double returnAmount = method(dollars, newprice);
            System.out.printf("Your amount is...%.2f ", returnAmount);
            boolean tester2 = false;
            while (tester2 == false) {
                System.out.println("Are there any more converstions?");
                String input = in.nextLine();
                if (input.equals("Yes") || input.equals("yes")) {
                    tester2 = true;
                    tester = false;
                } else if (input.equals("No") || input.equals("no")) {
                    tester2 = true;
                    tester = true;
                } else {
                    System.out.println("Enter yes to continue or no to stop ");
                    tester2 = false;
                }
            }
        }

    }

    /**
     * Method to convert currency to dollars
     *
     * @param x the amount of dollars we are converting
     * @param y the currency we are converting
     * @return the amount of dollars the currency is equivalent to
     */
    public static double method(double x, double y) {
        double newamount = 0;
        double totalamount = 0;
        double percentamount = 0;
        if (x > 100) {
            totalamount = x * .95 * y;

        } else {
            totalamount = x * .9 * y;
        }
        return totalamount;
    }

}
