
import java.util.Scanner;

// write to programm to calculate Temperature (you have fever or not ) using if else

public class _16IF_E_Temperature {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double temp = 103.5;
    if (temp >= 100) {
      System.out.println("You have a fever please rest");
    } else {
      System.out.println("your don't have a fever");
    }
    sc.close();
  }
}
