import java.util.Scanner;

public class _35ContinueFOR_1to5 {
  // ContinueFOR_ print 1 to 5 skip 3
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int n = 1; n <= 5; n++) {
      if (n == 3) {
        continue;
      }
      System.out.println(n);
    }
    sc.close();
  }

}
