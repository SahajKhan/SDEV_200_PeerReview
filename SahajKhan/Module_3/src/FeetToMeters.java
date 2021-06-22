/**
 * @author Sahaj Khan
 * Take input and convert from feet to meters and vice versa using methods.
 * @version 1.0
 */
public class FeetToMeters {
    /**
     * @param foot the number of feet to convert
     * @return meters
     */
    public static double footToMeters(double foot) { return 0.305 * foot; }

    /**
     * @param meter is the number of meters to convert
     * @return feet
     */
    public static double meterToFoot(double meter) { return 3.279 * meter; }

    public static void main(String[] args) {
        double m = 20.0;
        System.out.println("|Feet|\t|Meters\t|\t|Meters\t|\t|Feet|");
        for (double i = 1; i <= 10; i++) {
            System.out.printf("|%.1f|\t|%.3f\t|\t|%.1f\t|\t|%.3f|\n", i, footToMeters(i), m, meterToFoot(m));
            m += 5.0;
        }
    }
}
