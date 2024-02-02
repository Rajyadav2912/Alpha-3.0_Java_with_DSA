
import java.util.Scanner;

public class _05Avg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int Average = (A + B + C) / 3;
        System.out.println(Average);
        sc.close();
    }
}
