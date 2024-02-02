public class _79SwapAlternate {
    public static void SwapAlternate(int number[]) {

        for (int i = 0; i < number.length; i += 2) {
            if (number[i + 1] < number.length) {
                // swap number [i] = number[i+1]
                int temp = number[i + 1];
                number[i + 1] = number[i];
                number[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12 };
        SwapAlternate(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
