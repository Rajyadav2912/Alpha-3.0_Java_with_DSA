import java.util.Scanner;

/* write a programm to calculate Income Tax Calculator  using if else
*/
public class _13IF_E_Taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Income, Tax;
        System.out.print("Enter your Income:");
        Income = sc.nextInt();

        if (Income < 500000) {
            Tax = 0;
        } else if (Income >= 500000 && Income < 1000000) {
            Tax = (int) (Income * 0.2);
        } else {
            Tax = (int) (Income * 0.3);
        }
        System.out.println("your Tax is : " + Tax);
        sc.close();
    }
}
