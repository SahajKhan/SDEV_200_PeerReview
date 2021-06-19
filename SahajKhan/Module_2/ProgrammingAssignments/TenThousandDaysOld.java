import java.time.LocalDate;

/**
 * @author Sahaj Khan
 * Write an application that computes and displays the day on which you become (or became) 10,000 days old.
 * I will not use my real birthday as this will be uploaded to github.
 * @version 1.0
 */
public class TenThousandDaysOld {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.now();   //Set date to now
        birthday = birthday.withYear(1998);     //Set year to 1995
        birthday = birthday.withMonth(9);       //Set month to september
        birthday = birthday.withDayOfMonth(11); //Set day to 11
        birthday = birthday.plusDays(10000);    //Add 10000 days

        System.out.println("I will be 10000 days old on ");
        System.out.println(birthday.getMonth() + " " + birthday.getDayOfMonth() + " " + birthday.getYear());
    }
}
