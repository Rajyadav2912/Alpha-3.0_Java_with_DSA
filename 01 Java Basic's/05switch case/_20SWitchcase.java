

import java.util.Scanner;
public class _20SWitchcase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        System.out.print("Enter your number :");
        number = sc.nextInt();
        switch ( number ){
            case 1 : System.out.println("samosa");
            break ;
            case 2 : System.out.println("momos");
            break ;
            case 3 : System.out.println("pasta");
            break ;
            default : System.out.println(" we are wakeup");
        }
        sc.close();
    } 
}