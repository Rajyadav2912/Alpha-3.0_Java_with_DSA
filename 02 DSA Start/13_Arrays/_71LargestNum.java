
public class _71LargestNum {
//  Time complexity is  = O(n)
    public static int GetLargest(int num[]) {
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) { // O(n)
            if (Largest < num[i]) { // - infinity
                Largest = num[i];
            }
            if (Smallest > num[i]) { // + infinity
                Smallest = num[i];
            }
        }
        System.out.println("Smallest value is : " + Smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        System.out.println("Largest value is : " + GetLargest(num));

    }
}
