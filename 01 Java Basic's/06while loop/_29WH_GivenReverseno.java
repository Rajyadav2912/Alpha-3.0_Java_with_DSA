
import java.util.Scanner;

public class _29WH_GivenReverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10899;
        int reverse = 0;
        while (n > 0){
             int rem = n%10;
             reverse = (reverse * 10) + rem;
             n/=10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
