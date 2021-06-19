import java.time.LocalDate;

/**
 * @author Sahaj Khan
 * Write a program that declares two LocalDate objects and assign values that represent
 * January 31 and December 31 in the current year. Display output that demonstrates the
 * dates displayed when one, two, and three months are added to each of the objects.
 * @version 1.0
 */
public class TestMonthHandling {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        localDate1 =  localDate1.withMonth(1);      //Set month to January
        localDate1 = localDate1.withDayOfMonth(31); //Set day to the 31st

        LocalDate localDate2 = LocalDate.now();
        localDate2 = localDate2.withMonth(12);      //Set month to December
        localDate2 = localDate2.withDayOfMonth(31); //Set day to the 31st

        //Print the current Set dates
        System.out.println("LocalDate1 = " + localDate1);
        System.out.println("LocalDate2 = " + localDate2);

        //Add 1 month and print the date three times
        for (int i = 0; i < 3; i++) {
            //Add 1 month to the date
            localDate1 = localDate1.plusMonths(1);
            localDate2 = localDate2.plusMonths(1);

            //Print the date with the added month
            System.out.println("Adding one month");
            System.out.println("LocalDate1 = " + localDate1);
            System.out.println("LocalDate2 = " + localDate2);
        }
    }
}