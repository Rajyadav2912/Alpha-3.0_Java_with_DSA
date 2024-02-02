
import java.util.Scanner;

public class _25WH_1TOnwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int number = sc.nextInt();
        int count = 1 ;
        while( count <= number){
            System.out.print(count+ " ");
            count++;
        }
        sc.close();
    }
}
    