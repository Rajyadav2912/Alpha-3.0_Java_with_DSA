// Time Complexity = O(n)

public class _12Power {
    public static int Power(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        int xnm1 = Power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int OptimizePower(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        int halfPower = OptimizePower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        // System.out.println(Power(2, 5)); // 32
        System.out.println(OptimizePower(x, n));
    }
}
