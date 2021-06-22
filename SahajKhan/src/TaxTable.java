/**
 * @author Sahaj Khan
 * Create a method that prints a tax table for taxable income from $50,000 to $60,000 with intervals of $50.
 * @version 1.0
 */
public class TaxTable {
    /**
     * @param status is the income filing status, such as single, married, etc.
     * @param taxableIncome is the amount of annual income
     * @return the amount of taxes based on the status and income.
     */
    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        //Single or Separate
        if (status == 0 || status == 2) { // Compute tax for single filers
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 60000)
                tax = (8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25);
        }

        //Married filing Jointly or Qualified Widower
        if (status == 1) {
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 60000)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;

        }

        //Head of Household
        if (status == 3) {
            if (taxableIncome <= 11950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            else if (taxableIncome <= 60000)
                tax = (11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25);
        }

        return tax;
    }

    public static void main(String[] args) {
        double taxableIncome;

        for (taxableIncome = 50000; taxableIncome < 60001; taxableIncome += 50) {
            System.out.printf("%.0f\t%.0f\t%.0f\t%.0f\t%.0f\n", taxableIncome,
                    computeTax(0, taxableIncome),
                    computeTax(1, taxableIncome),
                    computeTax(2, taxableIncome),
                    computeTax(3, taxableIncome));
        }
    }
}