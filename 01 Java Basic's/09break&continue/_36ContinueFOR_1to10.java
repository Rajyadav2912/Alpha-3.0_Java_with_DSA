import java.util.*;

public class _36ContinueFOR_1to10 {
      /*
       * ContinueFOR_ print all no. but not
       * print in multiple of 10
       */
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your num :");
            int n = sc.nextInt();
            // do {}
            // System.out.print("enter your num :");
            // int n = sc.nextInt();
            // if (n % 10 == 0) {
            // // break;
            // continue;
            // }
            // System.out.println(n);
            // } while (true);
            // sc.close();

            for (int i = 0; i <= 100; i++) {
                  if (n % 10 == 0) { // break;
                        continue;
                  }
                  System.out.println(n);
            }

            sc.close();
      }

}
