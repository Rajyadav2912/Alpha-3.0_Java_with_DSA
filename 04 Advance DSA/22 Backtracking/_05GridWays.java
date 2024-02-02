public class _05GridWays {
    public static int GridWays(int i, int j, int row, int col) {
        // base case
        if (i == row - 1 && j == col - 1) {
            return 1;
        } else if (i == row || j == col) {
            return 0;
        }

        // recursion

        int way1 = GridWays(i + 1, j, row, col);
        int way2 = GridWays(i, j + 1, row, col);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int row = 3, col = 3;

        System.out.println(GridWays(0, 0, row, col));
    }
}
