
public class _08Logical {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        // AND opreator && A*B

        System.out.println((a>b) && (a<b)); // false
        System.out.println((a<b) && (a>b)); // false
        System.out.println((a>b) && (a>b)); // true
        System.out.println((a<b) && (a<b)); // false
        
        // OR opreator || A+B

        System.out.println((a>b) || (a<b));  // true
        System.out.println((a<b) || (a>b)); // true
        System.out.println((a>b) || (a>b)); // true
        System.out.println((a<b) || (a<b)); // false

        // NOT opreator ! A = A'

        System.out.println(!(a>b)); // false
        System.out.println(!(a<b)); // true
    }
}
