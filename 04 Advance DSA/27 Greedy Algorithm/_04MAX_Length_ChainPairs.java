import java.util.Arrays;
import java.util.Comparator;

public class _04MAX_Length_ChainPairs {
    public static void main(String[] args) {
        int Pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Lambda Function -> ShortForm
        Arrays.sort(Pairs, Comparator.comparingDouble(o -> o[1]));

        int ChainLen = 1;
        int ChainEnd = Pairs[0][1]; // Last Selected pairs ka End // Chain ka End

        for (int i = 1; i < Pairs.length; i++) {
            if (Pairs[i][0] > ChainEnd) {
                ChainLen++;
                ChainEnd = Pairs[i][1];
            }
        }
        System.out.println("MAXIMUM Length of Chain: " + ChainLen);
        // MAXIMUM Length of Chain: 3
    }
}
