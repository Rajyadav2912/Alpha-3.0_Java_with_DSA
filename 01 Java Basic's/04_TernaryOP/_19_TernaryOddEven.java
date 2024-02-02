
import java.util.Scanner;

public class _19_TernaryOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number :");
        number = sc.nextInt();

        String type = ( number % 2 == 0) ? "Even" : " Odd" ;
        System.out.println(type);
        
        sc.close();

      }
}
