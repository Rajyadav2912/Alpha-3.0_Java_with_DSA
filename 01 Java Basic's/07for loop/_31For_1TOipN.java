import java.util.Scanner;

public class _31For_1TOipN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        System.out.print("Enter your number :");
        num = sc.nextInt();
        for (int i = 1 ; i <= num ; i++){
            System.out.println(i+" ");
        }
        sc.close();
    }
}
