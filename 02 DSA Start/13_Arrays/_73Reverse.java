
public class _73Reverse {
    public static void Reverse(int number[]) {
        int First = 0, Last = number.length - 1;
        while (First < Last) {
            int Temp = number[First];
            number[First] = number[Last];
            number[Last] = Temp;
            First++;
            Last--;
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        Reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
