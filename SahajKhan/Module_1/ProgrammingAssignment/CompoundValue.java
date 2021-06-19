import java.util.Scanner;

/**
 * @author Sahaj Khan
 * Take user input and calculate compound interest for six months
 * @version 1.0
 */
public class CompoundValue {
    /**
     * compound() will calculate the compound interest for six months
     * @param cash The initial amount of cash put into the savings account.
     */
    public static double  compound (double cash) {
        return cash * (1.0 + .00417);
    }

    /**
     * in the the Scanner object that wil be used to take console input
     * input is the input from the user.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double input;
        System.out.println("Enter the monthly savings amount: ");
        input = in.nextDouble();

        for (int i = 0; i < 5; i++) {
            input = compound(input);
            input += 100;
        }

        System.out.printf("After the sixth month, the account value is $%f\n", compound(input));
    }
}
