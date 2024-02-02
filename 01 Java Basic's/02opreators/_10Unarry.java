
import java.util.Scanner;

public class _10Unarry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 5;
    // int b=a++;
    // int b=++a;
    // int b=--a;
    int b = a--;
    System.out.println(a);
    System.out.println(b);
    sc.close();
  }
}
