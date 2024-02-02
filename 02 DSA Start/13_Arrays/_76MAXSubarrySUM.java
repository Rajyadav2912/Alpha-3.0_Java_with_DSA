
public class _76MAXSubarrySUM {
    public static void MaxSubarrySUM(int number[]) {
        int curr_sum = 0;
        int Max_Sum = Integer.MIN_VALUE; // - infinity

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    // print sub arr
                    System.out.print(number[k] + " ");

                    curr_sum = curr_sum + number[k];
                }
                System.out.println(" = " + curr_sum);
                if (Max_Sum < curr_sum) {
                    Max_Sum = curr_sum;
                }
            }
        } // print Max_sum arr;
        System.out.println("Maximum Sub Array sum : " + Max_Sum);
    }

    public static void main(String[] args) {
        int number[] = { -1 };
        MaxSubarrySUM(number);
    }
}
