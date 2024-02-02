import java.util.Scanner;

public class _04sum1stnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter a value of n : ");
        n = sc.nextInt();
         int i = 1, sum = 0;
         while (i <= n){
            sum+=i; // sum= sum+i;
            i++;
         }
         System.out.println("Your sum is : " +sum);

         sc.close();
    }
}
