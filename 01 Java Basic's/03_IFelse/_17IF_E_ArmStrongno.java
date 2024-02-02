import java.util.Scanner;

// write a programm to calculate your number is Armstrong or not

public class _17IF_E_ArmStrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println("Arm strong number ");
        } else {
            System.out.println("Not-Arm strong number");
        }
        sc.close();
    }
}
