import java.util.Scanner;

public class _26WH_SumNnaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter a no. :");
        n = sc.nextInt();
       int i = 1,sum = 0;

        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    sc.close();
    }
}
