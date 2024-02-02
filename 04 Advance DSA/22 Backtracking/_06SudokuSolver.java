public class _06SudokuSolver {
    public static boolean isSafe(int Sudoku[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= Sudoku.length - 1; i++) {
            if (Sudoku[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= Sudoku[0].length - 1; j++) {
            if (Sudoku[row][j] == digit) {
                return false;
            }
        }

        // gird
        int stRow = (row / 3) * 3;
        int stCol = (col / 3) * 3;

        // gird 3 x 3
        for (int i = stRow; i < stRow + 3; i++) {
            for (int j = stCol; j < stCol + 3; j++) {
                if (Sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean SudokuSolver(int Sudoku[][], int row, int col) {
        // base case
        if (row == Sudoku.length && col == 0) {
            return true;
        }

        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == Sudoku[0].length) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (Sudoku[row][col] != 0) {
            return SudokuSolver(Sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(Sudoku, row, col, digit)) {
                Sudoku[row][col] = digit;
                if (SudokuSolver(Sudoku, nextRow, nextCol)) {
                    return true;
                } else {
                    Sudoku[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void PrintSudoku(int Sudoku[][]) {
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                System.out.print(Sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Sudoku[][] = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        // SudokuSolver(Sudoku, 0, 0);
        // PrintSudoku(Sudoku);
        if (SudokuSolver(Sudoku, 0, 0)) {
            System.out.println("solution is exist");
            PrintSudoku(Sudoku);
        } else {
            System.out.println("solution is not exist");
        }
    }
}