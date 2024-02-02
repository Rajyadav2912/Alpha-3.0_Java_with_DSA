
import java.util.Scanner;

public class _06Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition : " + (a + b));
        System.out.println("Substraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Moduls : " + (a % b));
        sc.close();
    }

}
