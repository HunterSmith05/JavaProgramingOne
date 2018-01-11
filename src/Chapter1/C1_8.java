package Chapter1;

/**
 * Program to display the perimeter and the area of a given circle to the
 * console
 *
 * @author Hunter Smith
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius, pi;
        radius = 5.5;
        pi = 3.14;
        System.out.println("Perimeter");
        System.out.println(radius * 2 * pi);
        System.out.println("Area");
        System.out.println(radius * radius * pi);
    }
}
