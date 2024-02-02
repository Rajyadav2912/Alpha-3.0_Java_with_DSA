
public class _53primeFun {
    public static boolean isprime(int n) {
        boolean isprime = true;
        // lets assume that our no. is true
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            // num is completly divided by 2 or ==0
            // so our no is not a prime
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println(isprime(3));
        PrimeInRange(100); // 2 to 20
    }
}
