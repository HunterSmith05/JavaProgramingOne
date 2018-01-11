package Chapter4;

import java.util.Scanner;

/**
 * Program takes user input to compute the total tax withholdings and displays
 * the results to the console
 *
 * @author Hunter Smith
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("How many hours did you work in a week?");
        double hours = in.nextDouble();
        System.out.println("What is your hourly pay?");
        double payrate = in.nextDouble();
        System.out.println("What is your federal tax withholding rate?");
        double federal = in.nextDouble();
        System.out.println("What is your state tax withholding rate?");
        double state = in.nextDouble();
        System.out.printf("Employee name:%s ", name);
        System.out.printf("\n Hours worked:%.2f\n", hours);
        System.out.printf("\n Pay Rate:%.2f\n", payrate);
        double grosspay = hours * payrate;
        System.out.printf("\n Gross Pay:%.2f\n", grosspay);
        System.out.println("Deductions:");
        double federal2 = federal * grosspay;
        double state2 = state * grosspay;
        double td = federal2 + state2;
        double netpay = grosspay - td;
        System.out.printf("\n Federal Withhodling (" + federal + ") : %.2f\n ", federal2);
        System.out.printf("\n State Withhodling (" + state + ") : %.2f\n", state2);
        System.out.printf("\n Total Deduction:%.2f\n", td);
        System.out.printf("\n Net Pay: %.2f\n", netpay);

    }
}
