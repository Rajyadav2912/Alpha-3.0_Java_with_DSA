public class _58Hollow_pattern {
    public static void Hollow_pattern(int row, int columb) {
        // outer loop i = rows
        for (int i = 1; i <= row; i++) {
            // inner loop j = columb
            for (int j = 1; j <= columb; j++) {
                if (i == 1 || i == row || j == 1 || j == columb) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Hollow_pattern(4, 5);
    }
}
// *****
// * *
// * *
// *****