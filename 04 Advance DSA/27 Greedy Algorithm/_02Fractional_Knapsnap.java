import java.util.Arrays;
import java.util.Comparator;

public class _02Fractional_Knapsnap {
    public static void main(String[] args) {
        int Val[] = { 60, 100, 120 };
        int Weight[] = { 10, 20, 30 };
        int W = 50; // capacity in kg

        double ratio[][] = new double[Val.length][2];
        // 0th col = store idx ; 1st col = store ratio

        for (int i = 0; i < Val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = Val[i] / (double) Weight[i];
        }
        // Ascending order

        // Lambda Function -> ShortForm
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W; // capacity in kg
        int finalValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= Weight[idx]) { // include full items
                finalValue += Val[idx];
                capacity -= Weight[idx];
            } else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final Value: " + finalValue + "rs");// final Value: 240rs
        System.out.println("Capacity: " + W + "kg"); // Capacity: 50kg
    }
}
