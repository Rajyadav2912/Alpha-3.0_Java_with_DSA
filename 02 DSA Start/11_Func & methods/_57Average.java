import java.util.Scanner;
// Ques 1 :Write a Java method to compute the averageof three numbers.

public class _57Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number a :");
        double a = sc.nextDouble();

        System.out.print("Enter your number b :");
        double b = sc.nextDouble();

        System.out.print("Enter your number c :");
        double c = sc.nextDouble();

        double Average = (a + b + c) / 3;
        System.out.println("Your Average of 3 number is :" + Average);
        sc.close();
    }

    // public static double Average(double a, double b, double c) {
    // return Average(a, b, c)/3;
    // }
}
