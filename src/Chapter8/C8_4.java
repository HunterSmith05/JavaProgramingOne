package Chapter8;

/**
 * Program to display the work week of employees
 *
 * @author Hunter Smith
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        int[][] x
                = {{2, 4, 3, 4, 5, 8, 8, 34},
                {7, 3, 4, 3, 3, 4, 4, 28},
                {3, 3, 4, 3, 3, 2, 2, 20},
                {9, 3, 4, 7, 3, 4, 1, 31},
                {3, 5, 4, 3, 6, 3, 8, 32},
                {3, 4, 4, 6, 3, 4, 4, 28},
                {3, 7, 4, 8, 3, 8, 4, 37},
                {6, 3, 5, 9, 2, 7, 9, 41}};
        printarray(x);
    }

    /**
     * Method to convert currency to dollars
     *
     * @param x the amount of dollars we are converting
     *
     * @return the total amount
     */
    public static int[] printarray(int[][] x) {
        System.out.print("                   Su        M         T         W         Th        F         Sa     Total");
        int total[] = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 8; i++) {
            System.out.print("\nEmployee " + i);
            for (int j = 0; j < 7; j++) {
                System.out.print("         " + x[i][j]);
                total[i] += x[i][j];
            }
            System.out.print("        " + total[i]);
        }
        return total;
    }
}
