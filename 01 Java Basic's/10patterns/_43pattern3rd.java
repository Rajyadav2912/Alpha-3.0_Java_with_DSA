import java.util.Scanner;

public class _43pattern3rd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your number : ");
        //  int num = sc.nextInt();
    
        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= i ; j++){ 
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
