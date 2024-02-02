
import java.util.Scanner;

// write a programm to print number is positive or negative using if else

public class _15IF_E_Positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number :");
        number = sc.nextInt();

        if (number >= 0) {
            System.out.println(" number is positive ");
        } else {
            System.out.println("number is negative ");
        }
        sc.close();
    }

}
