
public class _78Kadanes_Algo {
    public static void Kadane(int number[]) {
        int Max_Sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < number.length; i++) {
            curr_sum = curr_sum + number[i];
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            Max_Sum = Math.max(Max_Sum, curr_sum);
        }
        System.out.println("Maximum sum is : " + Max_Sum);
    }

    public static void main(String[] args) {
        int number[] = { -1 };
        Kadane(number);
    }
}
