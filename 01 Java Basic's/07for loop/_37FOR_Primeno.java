
import java.util.Scanner;

public class _37FOR_Primeno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter your num:");
    n = sc.nextInt();
    int count = 0 ;
    for(int i = 1 ; i <= n ; i++){
        if (n % i == 0){
            count++;
        }
    }
    if (count == 2){
        System.out.println("No. is prime ");
    }
    else{
        System.out.println("not prime");
    }
    sc.close();
  }    
}
