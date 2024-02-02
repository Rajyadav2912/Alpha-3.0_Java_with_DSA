import java.util.Scanner;

public class _32FOR_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1 ; i <= num ; i++){
          System.out.println("* * * * *");
        }
        sc.close();
    }
}
