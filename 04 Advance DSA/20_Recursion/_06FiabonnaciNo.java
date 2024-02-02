
// Time complexity = O(2^n)
// Space Complexity = O(n)

public class _06FiabonnaciNo {
    public int fib(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int Fib(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = Fib(n - 1);
        int fn2 = Fib(n - 2);

        return fn1 + fn2;
    }

    public static void main(String[] args) {
        // fib(3);
        // int n = 5;
        System.out.println(Fib(5));
        // System.out.println(Fib(24));
        // System.out.println(Fib(25));
    }
}
