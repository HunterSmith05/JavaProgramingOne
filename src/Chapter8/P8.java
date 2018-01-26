package Chapter8;

import java.util.Scanner;

/**
 * Program to display how much a list of workers worked in one week
 *
 * @author Hunter Smith
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double[][] salesArray = new double[4][5];
        String[] letters = {"A", "B", "C", "D"};
        boolean tester = true;
        char id, id2;
        char letter = '\u0041';
        int idNumber = 0;
        int monthNumber = 0;
        while (tester == true) {
            System.out.print("Enter the saleman ID as A, B, C, or D:");
            id = in.next().charAt(0);
            if (id == 'A' || id == 'a') {
                idNumber = 0;
            } else if (id == 'B' || id == 'b') {
                idNumber = 1;
            } else if (id == 'C' || id == 'c') {
                idNumber = 2;
            } else if (id == 'D' || id == 'd') {
                idNumber = 3;
            }
            System.out.print("Enter the days as M, T, W, H, F:");
            id2 = in.next().charAt(0);
            if (id2 == 'M' || id2 == 'm') {
                monthNumber = 0;
            } else if (id2 == 'T' || id2 == 't') {
                monthNumber = 1;
            } else if (id2 == 'W' || id2 == 'w') {
                monthNumber = 2;
            } else if (id2 == 'H' || id2 == 'h') {
                monthNumber = 3;
            } else if (id2 == 'F' || id2 == 'f') {
                monthNumber = 4;
            }
            System.out.print("Enter the amount of the sale for " + id + " on " + id2 + " :");
            double sales = in.nextDouble();
            salesArray[idNumber][monthNumber] = sales;
            System.out.println("More data? Enter Y for more or N to stop.");
            char test = in.next().charAt(0);
            if (test == 'Y' || test == 'y') {
                tester = true;
            } else if (test == 'N' || test == 'n') {
                tester = false;
            }
        }
        System.out.println("      Salesman     M     T      W       H        F");
        for (int i = 0; i < salesArray.length; i++) {
            System.out.print("\t" + letters[i]);
            for (int j = 0; j < salesArray[i].length; j++) {

                System.out.print("\t" + salesArray[i][j]);
            }
            System.out.println("");
        }

    }
}
