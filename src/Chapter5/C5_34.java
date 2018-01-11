package Chapter5;

import java.util.Scanner;

/**
 * Program plays rock paper scissors with the user
 *
 * @author Hunter Smith
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int playerCount = 0;
        int compCount = 0;
        while (playerCount < 3 && compCount < 3) {
            System.out.println("What is your choice Scissor (0), Rock (1), Paper(2)");
            int player = in.nextInt();
            int computernum = (int) (Math.random() * 3);
            if (player == 0 && computernum == 1) {
                System.out.println("You played Scissors and the computer played Rock. You lost.");
                compCount += 1;
            } else if (player == 0 && computernum == 0) {
                System.out.println("You played Scissors and the computer played Scissors. You tied .");
                compCount += 1;
                compCount -= 1;
            } else if (player == 0 && computernum == 2) {
                System.out.println("You played Scissors and the computer played Paper. You won.");
                playerCount += 1;
            } else if (player == 1 && computernum == 1) {
                System.out.println("You played Rock and the computer played Rock. You tied.");
                compCount += 1;
                compCount -= 1;
            } else if (player == 1 && computernum == 0) {
                System.out.println("You played Rock and the computer played Scissors. You won.");
                playerCount += 1;
            } else if (player == 1 && computernum == 2) {
                System.out.println("You played Rock and the computer played Paper. You lost.");
                compCount += 1;
            } else if (player == 2 && computernum == 2) {
                System.out.println("You played Paper and the computer played Paper. You tied.");
                compCount += 1;
                compCount -= 1;
            } else if (player == 2 && computernum == 0) {
                System.out.println("You played Paper and the computer played Scissors. You lost.");
                compCount += 1;
            } else if (player == 2 && computernum == 1) {
                System.out.println("You played Paper and the computer played Rock. You won.");
                playerCount += 1;
            }

        }
        if (playerCount == 3) {
            System.out.println("You won more than two times");
        }
        if (compCount == 3) {
            System.out.println("The computer won more than two times");
        }
    }
}
