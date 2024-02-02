import java.util.*;

public class _86_2DArrRepresentation {
    public static boolean searchkey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter your key : ");
        int key = sc.nextInt();

        // OutPut
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                // Calculate the largets value
                Largest = Math.max(matrix[i][j], Largest);
                // Calculate the largets value
                Smallest = Math.min(matrix[i][j], Smallest);
            }
            System.out.println();
        }
        System.out.println("Largets ky is : " + Largest);
        System.out.println("Smaillest key is : " + Smallest);
        searchkey(matrix, key);
        sc.close();
    }
}
