
import java.util.Scanner;

public class _28WH_Reverseno {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 10899;
    
    while (n > 0){
        int rem =n%10;
        System.out.print(rem);
        n/=10;
        
    }
    sc.close();
}    
}

