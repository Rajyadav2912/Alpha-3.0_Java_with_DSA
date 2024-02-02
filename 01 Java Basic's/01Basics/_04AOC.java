
import java.util.Scanner;

public class _04AOC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sc.close();
    }
}