
import java.util.*;
// import java.lang.String;

public class _90Strings {
    public static void PrintLetter(String Fullname) {
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.print(Fullname.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz%@#");
        // String are IMMUTABLE

        String name;
        name = sc.nextLine();
        System.out.println(name);

        // Concatination

        String first_name = "Raj";
        String last_name = "Yadav";
        String Fullname = first_name + " " + last_name;
        System.out.println(Fullname);

        // count length
        System.out.println(Fullname.length());
        // System.out.println(Fullname.charAt(0));
        PrintLetter(Fullname);
        sc.close();
    }
}