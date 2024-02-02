
import java.util.Scanner;

// print if a number is Even or odd  using if else

public class _12IF_E_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter your number : ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }

}
