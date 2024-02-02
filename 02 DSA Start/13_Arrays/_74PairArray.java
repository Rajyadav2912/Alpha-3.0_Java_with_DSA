
public class _74PairArray {
    public static void PairArray(int number[]) {
        int Total_Pair = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + current + "," + number[j] + ") ");
                Total_Pair++;
            }
            System.out.println();
        }
        System.out.println("Total Pair is : " + Total_Pair);
    }

    public static void main(String[] args) {
        // index value [ 0, 1, 2, 3, 4 ]
        int number[] = { 2, 4, 6, 8, 10 };
        PairArray(number);
    }
}
