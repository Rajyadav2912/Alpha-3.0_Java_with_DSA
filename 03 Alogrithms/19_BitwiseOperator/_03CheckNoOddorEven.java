import java.util.Scanner;

public class _03CheckNoOddorEven {

    public static boolean OddorEven(int n) {
        int Bitmask = 1;
        if ((n & Bitmask) == 0) {
            System.out.println("Even");
            return true;
        } else {
            System.out.println("Odd");
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OddorEven(n);
        sc.close();
    }
}
