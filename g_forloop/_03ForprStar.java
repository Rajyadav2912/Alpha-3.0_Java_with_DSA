import java.util.Scanner;

public class _03ForprStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4 ; //sc.nextInt();
        // for (int line = 1 ; line <= n ; line++){
        //     System.out.println("* * * *");
        // }
            int line = 1;
        while (line <= n){
            System.out.println("* * * *");
            line++;
        }
        sc.close();
    }
    
}
