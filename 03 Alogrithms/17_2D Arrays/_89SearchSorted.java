import java.util.Scanner;

public class _89SearchSorted {
    public static boolean SearchSortedMatrix(int matrix[][], int key) {
        int Row = 0;
        int Columb = matrix[0].length - 1;

        while (Row <= matrix.length && Columb >= 0) {
            if (matrix[Row][Columb] == key) {
                System.out.println("Key is found : " + "(" + Row + "," + Columb + ")");
                return true;
            } else if (key < matrix[Row][Columb]) {
                Columb--;
            } else {
                Row++;
            }
        }
        System.out.println("Key is not found!");
        return false;
    }

    // 2nd logic
    public static boolean SearchMatrix(int matrix[][], int key) {

        int Columb = matrix[0].length - 1;

        for (int Row = 0; Row < matrix.length;) {
            if (matrix[Row][Columb] == key) {
                System.out.println("Key is found : " + "(" + Row + "," + Columb + ")");
                return true;
            } else if (key < matrix[Row][Columb]) {
                Columb--;
            } else {
                Row++;
            }
        }
        System.out.println("Key is not found!");
        return false;
    }

    // 3rd approch
    public static boolean SearchSorted(int matrix[][], int key) {

        int Row = matrix.length - 1;

        for (int Columb = 0; Columb < matrix[0].length;) {
            if (matrix[Row][Columb] == key) {
                System.out.println("Key is found : " + "(" + Row + "," + Columb + ")");
                return true;
            } else if (key > matrix[Row][Columb]) {
                Row++;
            } else {
                Columb--;
            }
        }
        System.out.println("Key is not found!");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.print("Enter your key : ");
        int key = sc.nextInt();
        // SearchSortedMatrix(matrix, key);
        SearchMatrix(matrix, key);
        // SearchSorted(matrix, key);
        sc.close();
    }
}
