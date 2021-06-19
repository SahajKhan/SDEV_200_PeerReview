import java.util.Scanner;

/**
 * @author Sahaj Khan
 * The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer
 * turns in the current calendar year. The premium is computed by taking the decade of the customer’s age,
 * adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360, which is calculated
 * by adding the decades (3) to 15, and then multiplying by 20. Write an application that prompts a user
 * for the current year and a birth year. Pass both to a method that calculates and returns the premium
 * amount, and then display the returned amount.
 * @version 1.0
 */
public class Insurance {

    /**
     * @param currentYear The current year as entered by the user.
     * @param birthYear The year of birth of the current user.
     * @return The cost of the premium.
     */
    static double premium (int currentYear, int birthYear) { return (((currentYear - birthYear) / 10) +15 )* 20; }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear, birthYear;

        System.out.println("Enter the current year.");
        currentYear = in.nextInt();

        System.out.println("Enter the year of your birth.");
        birthYear = in.nextInt();

        System.out.printf("Your premium is :%.2f", premium(currentYear, birthYear));
    }
}
