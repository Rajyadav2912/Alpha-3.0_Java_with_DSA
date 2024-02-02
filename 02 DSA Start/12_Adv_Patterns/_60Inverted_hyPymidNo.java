
public class _60Inverted_hyPymidNo {
    public static void Inverted_HalfPyramidNo(int n) {
        for (int i = 1; i <= n; i++) {
            // inner number
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Inverted_HalfPyramidNo(5);
    }
}
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
