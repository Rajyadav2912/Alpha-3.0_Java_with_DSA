public class _49Factorial {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; //
    }

    public static void main(String[] args) {
        System.out.println("your factorial is : " + factorial(4)); // your factorial is : 24
        System.out.println("your factorial is : " + factorial(5)); // your factorial is : 120
        System.out.println("your factorial is : " + factorial(6)); // your factorial is : 720
    }

}
