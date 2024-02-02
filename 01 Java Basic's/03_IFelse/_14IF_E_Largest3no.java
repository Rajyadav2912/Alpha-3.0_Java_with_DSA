
import java.util.Scanner;
// print Largest 3 number  using if else

public class _14IF_E_Largest3no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter a :"); // a >> b >> c
        a = sc.nextInt(); // (a > b)
                          // |
        System.out.print("enter b :"); // (a > c ) ( b > c)
        b = sc.nextInt(); // a largest b largest
                          // else c lagest
        System.out.print("Enter c :");
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("A is largest");
        } else if (b > c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
        sc.close();
    }
}
