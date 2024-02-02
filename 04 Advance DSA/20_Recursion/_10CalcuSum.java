public class _10CalcuSum {
    public static int calcuSum(int n) {
        // base case
        if (n == 1) {
            return 1;
        }

        int Snm1 = calcuSum(n - 1);
        int Snm = n + Snm1;
        return Snm;
    }

    public static void main(String[] args) {
        System.out.println(calcuSum(1));
        System.out.println(calcuSum(2));
        System.out.println(calcuSum(3));
        System.out.println(calcuSum(4));
        System.out.println(calcuSum(5));
        // System.out.println(calcuSum(6));
        // System.out.println(calcuSum(7));
        // System.out.println(calcuSum(8));
        // System.out.println(calcuSum(9));
        // System.out.println(calcuSum(10));
    }
}
