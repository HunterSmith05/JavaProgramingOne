package Chapter2;

import java.util.Scanner;

/**
 * Program to display user input which is converted into the area and volume of
 * a cylinder to the console
 *
 * @author Hunter Smith
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("What is the radius of your cylinder...");
        double radius = in.nextDouble();
        System.out.println("What is the length of the cylinder...");
        double length = in2.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The Area is " + area);
        System.out.println("The Volume is " + volume);
    }
}
