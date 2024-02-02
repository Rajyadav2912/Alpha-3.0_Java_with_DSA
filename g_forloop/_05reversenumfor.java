import java.util.Scanner;

public class _05reversenumfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = 10899; //sc.nextInt();
           
           while (n > 0){
            
            int rem;
            rem = n % 10;
            
            n/=10; // n = n/10;
            System.out.print(rem);
           }
          sc.close();
    }
}
