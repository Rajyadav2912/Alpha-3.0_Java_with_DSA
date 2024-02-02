
public class _59Inverted_HalfPyramid {
    public static void Inverted_HalfPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" *" + j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Inverted_HalfPyramid(3);
    }
}
// *
// * *
// * * *
// * * * *
// * * * * *