package Chapter7;

import java.util.Scanner;

/**
 * Program displays grades based off students scores
 *
 * @author Hunter Smith
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students?");

        int[] grades = new int[in.nextInt()];
        System.out.print("Enter " + grades.length + " scores:");
        int bestScore = 0;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
            if (grades[i] > bestScore) {
                bestScore = grades[i];
            }

        }

        //printing the contents of the array
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + grade(grades, bestScore, i));
        }

    }

    /**
     * Method to convert currency to dollars
     *
     * @param grades the grade going into the method
     * @param bestScore is the best current score
     * @param i is a empty int used for if statements
     * @return the letter grade
     */
    public static char grade(int[] grades, int bestScore, int i) {
        char letterGrade = 'E';

        if (grades[i] >= bestScore - 10) {
            letterGrade = 'A';
        } else if (grades[i] >= bestScore - 20) {
            letterGrade = 'B';
        } else if (grades[i] >= bestScore - 30) {
            letterGrade = 'C';
        } else if (grades[i] >= bestScore - 40) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';

        }
        return letterGrade;

    }
}
