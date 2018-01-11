package Chapter2;

import java.util.Scanner;

/**
 * Program takes user input and then displays the price of food, drink, dessert,
 * and total price to the console
 *
 * @author Hunter Smith
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner inMeal = new Scanner(System.in);
        Scanner inDrink = new Scanner(System.in);
        Scanner inDessert = new Scanner(System.in);

        System.out.println("What is the price of your meal...");
        double Mealprice = inMeal.nextDouble();
        System.out.println("What is the price of your drink...");
        double Drinkprice = inDrink.nextDouble();
        System.out.println("What is the price of your dessert...");
        double Dessertprice = inDessert.nextDouble();
        double total = Mealprice + Drinkprice + Dessertprice;
        double tax = total * .1;
        double tip = (tax + total) * .15;
        double finaltotal = total + tax + tip;
        System.out.println("Your price for food is..." + total + " your tax is..." + tax + " your tip is..." + tip + " Your total cost is..." + finaltotal);
    }
}
