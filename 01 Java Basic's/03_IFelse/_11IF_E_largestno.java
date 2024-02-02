import java.util.Scanner;

// print Largest of 2 number using if else

public class _11IF_E_largestno {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = 3;
      int b = 2;

      if (a > b) {
         System.out.println("A is largest than B");
      } else {
         System.out.println("B is largest than A");
      }
      sc.close();

   }
}
