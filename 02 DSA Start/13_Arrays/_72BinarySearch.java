import java.util.*;

public class _72BinarySearch {
    public static int BinarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start += 1;
            } else {
                end -= 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = { 2, 4, 6, 8, 10 };
        System.out.print("Enter your key :");
        int key = sc.nextInt();
        System.out.println("Index is : " + BinarySearch(number, key));
        sc.close();
    }
}