package Chapter2;

import java.util.Scanner;

/**
 * Program to display takes input from user and then converts it into Fahrenheit
 * to the console
 *
 * @author Hunter Smith
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        {
            Scanner Celsius = new Scanner(System.in);

            System.out.println("Enter a your tempature in Celcius...");
            int celcius = Celsius.nextInt();
            double far = (9.0 / 5) * celcius + 32;
            System.out.println("Your value in Celsius " + celcius + " Your value in Fahrenheit " + far);
        }
    }
}
