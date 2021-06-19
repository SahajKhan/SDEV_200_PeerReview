import java.util.Scanner;

/**
 * @author Sahaj Khan
 * Write a program that accepts a number of minutes and converts it both to hours and days.
 * For example, 6,000 minutes equals 100 hours and equals 4.167 days.
 * @version 1.0
 */
public class MinutesConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double minutes;

        System.out.println("Enter the number of hours you would like to convert");
        minutes = in.nextDouble();
        System.out.printf("%.3f equals %.3f hours and equals %.3f days.",  minutes, minutes/60, minutes/60/24);
    }
}
