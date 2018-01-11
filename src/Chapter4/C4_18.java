package Chapter4;

import java.util.Scanner;

/**
 * Program takes user input to compute which major and what grade you are in and
 * then prints the results to the console
 *
 * @author Hunter Smith
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your major (M=mathimatics,C=Computer science,I=Information technology) What is your grade (Indicated by 1,2,3,or 4)");
        String a = in.nextLine();
        char b, c;
        b = a.charAt(0);
        c = a.charAt(1);
        if (b == ('M') && c == ('1')) {
            System.out.println("Mathmatics Freshman");
        } else if (b == ('M') && c == ('2')) {
            System.out.println("Mathmatics Softmore");
        } else if (b == ('M') && c == ('3')) {
            System.out.println("Mathmatics Junior");
        } else if (b == ('M') && c == ('4')) {
            System.out.println("Mathmatics Senoir");
        } else if (b == ('C') && c == ('1')) {
            System.out.println("Computer Science Freshman");
        } else if (b == ('C') && c == ('2')) {
            System.out.println("Computer Science Softmore");
        } else if (b == ('C') && c == ('3')) {
            System.out.println("Computer Science Junior");
        } else if (b == ('C') && c == ('4')) {
            System.out.println("Computer Science Senoir");
        } else if (b == ('I') && c == ('1')) {
            System.out.println("Information technology Freshman");
        } else if (b == ('I') && c == ('2')) {
            System.out.println("Information technology Softmore");
        } else if (b == ('I') && c == ('3')) {
            System.out.println("Information technology Junior");
        } else if (b == ('I') && c == ('4')) {
            System.out.println("Information technology Senoir");
        } else {
            System.out.println("Invalid input");
        }
    }
}
