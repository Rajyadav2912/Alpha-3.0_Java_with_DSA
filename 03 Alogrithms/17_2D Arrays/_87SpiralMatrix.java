
public class _87SpiralMatrix {
    public static void SpiralMatrix(int matrix[][]) {
        int Start_Row = 0;
        int End_Row = matrix.length - 1;
        int Start_Col = 0;
        int End_Col = matrix[0].length - 1;

        while (Start_Row <= End_Row && Start_Col <= End_Col) {
            // Top
            for (int j = Start_Col; j <= End_Col; j++) {
                System.out.print(matrix[Start_Row][j] + " ");
            }
            // Right
            for (int i = Start_Row + 1; i <= End_Row; i++) {
                System.out.print(matrix[i][End_Col] + " ");
            }
            // Bottom
            for (int j = End_Col - 1; j >= Start_Col; j--) {
                System.out.print(matrix[End_Row][j] + " ");
            }
            // Left
            for (int i = End_Row - 1; i >= Start_Row + 1; i--) {
                System.out.print(matrix[i][Start_Col] + " ");
            }
            Start_Row++;
            End_Row--;
            Start_Col++;
            End_Col--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        SpiralMatrix(matrix);
    }
}
