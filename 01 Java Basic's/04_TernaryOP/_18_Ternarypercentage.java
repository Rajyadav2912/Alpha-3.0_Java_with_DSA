
import java.util.Scanner;

public class _18_Ternarypercentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks;

        System.out.print("Enter your percentage :");
        marks = sc.nextInt();

        String reportcard = ((marks >= 33) ? "Pass" : "Fail");
        System.out.println(reportcard);
        sc.close();
    }
}
// if (result >= 33){
// System.out.println("Pass");
// }
// else {
// System.out.println("Fail");
// }
