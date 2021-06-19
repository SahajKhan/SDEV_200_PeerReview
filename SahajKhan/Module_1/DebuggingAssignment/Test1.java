/*
Debug this assignment
*/

/*
Code with Errors:

Import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scaner input = new Scanner();
    System.out.print("Enter an integer: ");
    int v = Input.nextInt());
    System.out.printLn("You entered " & v);

    System.out,print("Enter a double: ");
    double v2 = input.nextInt(),
    Systems.println("You entered " & v2);
  };

*/

/*Debugged Code:*/
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int v = input.nextInt();
        System.out.println("You entered " + v);
        System.out.println("Enter a double: ");
        double v2 = input.nextInt();
        System.out.println("You entered " + v2);
    }
}
