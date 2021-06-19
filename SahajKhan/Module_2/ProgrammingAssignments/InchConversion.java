import java.util.Scanner;

/**
 * @author Sahaj Khan
 * There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion.
 * Its main() method accepts a value in inches from a user at the keyboard,
 * and in turn passes the entered value to two methods.
 * One converts the value from inches to feet, and the other converts the same value from inches to yards.
 * Each method displays the results with appropriate explanation.
 * @version 1.0
 */
public class InchConversion {
    /**
     * @param inches number of inches that must be converted
     * @return feet
     */
    static double inchToFeet(double inches) { return inches/12.0; }

    /**
     * @param inches number of inches that must be converted
     * @return yards
     */
    static double inchToYard(double inches) { return inches/36.0; }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inches;

        System.out.println("Enter the number of inches you would like to convert");
        inches = in.nextDouble();
        System.out.printf("%.2f inches are %.2f feet and %.2f yards.\n", inches, inchToFeet(inches), inchToYard(inches));
    }
}
