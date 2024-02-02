import java.util.Scanner;

public class _54Opti_prime {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        // it basically Math.sqrt func is root(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no :");
        int n = sc.nextInt();
        System.out.println(isprime(n)); // true
        sc.close();
    }
}
