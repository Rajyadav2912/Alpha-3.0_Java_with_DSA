import java.util.Scanner;

public class _46Syntax_with_para {
    public static int calculatesum(int num1, int num2) {
        int sum = num1 + num2; // parameters or formal parameters
        return sum;
        // output return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // call function
        int sum = calculatesum(a, b);
        // arguments or actual parameters
        System.out.println("sum is : " + sum);

        sc.close();
    }
}
