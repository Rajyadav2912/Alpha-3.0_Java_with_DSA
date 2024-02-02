import java.util.Arrays;

public class _03MIN_Absolute_Diff {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A); // Sort ke denge Array A ko
        Arrays.sort(B); // Sort ke denge Array B ko

        int Min_Diff = 0;

        for (int i = 0; i < A.length; i++) {
            Min_Diff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min Absolute Difference of Pairs : " + Min_Diff);
        // Min Absolute Difference of Pairs : 0
    }
}
