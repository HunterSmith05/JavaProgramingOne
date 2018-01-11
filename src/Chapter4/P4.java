package Chapter4;

import java.util.Scanner;

/**
 * Program takes user input to compute which is the better bidder and then
 * prints the results to the console
 *
 * @author Hunter Smith
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name of the first bidder?");
        String name1 = in.next();
        System.out.println("How many hours does the first bidder work?");
        int hours1 = in.nextInt();
        System.out.println("How much does the first bidder charge per hour?");
        double perhour1 = in.nextDouble();
        System.out.println("What is the name of the second bidder?");
        String name2 = in.nextLine();
        System.out.println("How many hours does the second bidder work?");
        int hours2 = in.nextInt();
        System.out.println("How much does the second bidder charge per hour?");
        double perhour2 = in.nextDouble();
        double cost1 = hours1 * perhour1;
        double cost2 = hours2 * perhour2;
        if (cost1 < cost2) {
            System.out.printf("" + name1 + "is cheaper with a cost of %.2f", cost1);
        } else if (cost2 < cost1) {
            System.out.printf("" + name2 + "is cheaper with a cost of %.2f", cost2);
        } else if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("" + name1 + "is cheaper with a cost of %.2f and hours %d", cost1, hours1);
        } else if (cost1 == cost2 && hours2 < hours1) {
            System.out.printf("" + name2 + "is cheaper with a cost of %.2f and hours %d", cost2, hours2);
        } else if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("Bidder one %s and Bidder %s have identical bids", name1, name2);
            System.out.printf("\nBidder one cost %.2f at %d and Bidder two %.2f at %d", cost1, hours1, cost2, hours2);
            System.out.printf("\n Bidder one's cost per hour is %.2f and Bidder two's is %.2f", perhour1, perhour2);
            System.out.printf("\n Bidder one's hours is %.2f and Bidder two's is %.2f", hours1, hours2);

        }
    }
}
