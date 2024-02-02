import java.util.*;

public class _01Recursive {
    public static int factorial(int n) {
        // Base case
        if (n == 0)
            return 1;

        // Call yaha pe ho raha hn
        int smallProblem = factorial(n - 1);
        int bigProblem = n * smallProblem;
        return bigProblem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.print(ans);
        sc.close();
    }
}
