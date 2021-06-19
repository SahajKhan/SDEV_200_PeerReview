import java.util.Scanner;

/**
 * @author Sahaj Khan
 * Take input and convert from feet to meters.
 * @version 1.0
 */
public class FeetToMeters {
    public static void main(String[] args) {
        double input;   //takes input from the user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        input = in.nextDouble();
        System.out.println(input + " feet is " + (input * 0.305) + " meters");
    }
}
