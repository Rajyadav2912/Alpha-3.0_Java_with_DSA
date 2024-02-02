
import java.util.*;

public class _68InOpUP {
    public static void main(String[] args) {

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        // int phy ;
        // phy = sc.nextInt();

        // array length
        System.out.println("Lenght of array : " + marks.length);
        // Input
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        // output

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        // update
        // marks[2] = marks[2] + 1;
        // System.out.println("Math : " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage :" + percentage);
        sc.close();
    }
}
