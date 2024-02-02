import java.util.Scanner;

public class _21SW_calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char opeartor;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        
        System.out.print("Enter b : ");
        b = sc.nextInt();
 
        System.out.print("Enter opreator");
        opeartor = sc.next().charAt(0);

        switch(opeartor){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Invaild opeartor");
        }
       sc.close();
    }
}
