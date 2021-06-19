/**
 * @author Sahaj Khan
 * Write a program that displays two chairs at a table using the X character.
 * @version 1.0
 */
public class TableAndChairs {
    /**
     * @param space the number of whitespaces
     * @return String of whitespaces
     */
    public static String space (int space) {
        String returnString = "";
        for (int i = 0; i < space; i++) { returnString += " "; }
        return returnString;
    }
    public static void main(String[] args) {
        System.out.println("X" + space(22) + "X");
        System.out.println("X" + space(22) + "X");
        System.out.println("X" + space(6) + "XXXXXXXXXX" + space(6) + "X");
        System.out.println("XXXXX  X" + space(8) + "X  XXXXX");
        System.out.println("X   X  X" + space(8) + "X  X   X");
        System.out.println("X   X  X" + space(8) + "X  X   X");
    }
}