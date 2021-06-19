import java.util.Scanner;

/**
 * @author Sahaj Khan
 * Write a program that calculates eggs by dozen and singles
 * Cost of one dozen eggs are $3.25 and single eggs are $0.45.
 * @version 1.0
 */
public class Eggs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfEggs, dozens, looseEggs;

        System.out.println("Enter the number of eggs you would like to order");
        numOfEggs = in.nextInt();
        dozens = numOfEggs/12;
        looseEggs = numOfEggs%12;

        System.out.printf("You ordered %d eggs. That's %d dozen at $3.25 per dozen and %d loose eggs at " +
                "45 cents each for a total of %.2f\n", numOfEggs,dozens, looseEggs, dozens * 3.25 + looseEggs *.45);
    }
}
