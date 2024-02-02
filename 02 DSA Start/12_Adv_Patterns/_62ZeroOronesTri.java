
public class _62ZeroOronesTri {
    public static void Zero_onesTrr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Zero_onesTrr(10);
    }
}
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
