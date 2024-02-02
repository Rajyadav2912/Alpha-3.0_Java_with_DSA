import java.util.Scanner;

//  Time complexity is  = O(n)
public class _70LineraSearch {
    public static int LineraSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) { // O(n)
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8 };

        System.out.print("Enter your key : ");
        int key = sc.nextInt();

        int index = LineraSearch(num, key);
        if (index == -1) {
            System.out.println("Key is not found : " + index);
        } else {
            System.out.println("Key is found : " + index);
        }
        sc.close();
    }
}
