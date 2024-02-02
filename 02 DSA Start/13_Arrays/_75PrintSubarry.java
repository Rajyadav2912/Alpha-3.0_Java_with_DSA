
public class _75PrintSubarry {

    public static void PrintSubarry(int number[]) {
        int totalpair = 0;
        for (int i = 0; i < number.length - 1; i++) {
            int start = i;
            for (int j = i; j < number.length - 1; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    // print sub arr
                    System.out.print(number[k] + " ");
                }
                totalpair++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pair is : " + totalpair);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12 };
        PrintSubarry(number);
    }
}
