
public class _47Memory {
    // Call by value ( in Java)

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a; // formal parameters
        a = b;
        b = temp;

    }

    public static void main(String[] args) {
        // sum();
        int a = 5;
        int b = 10;

        swap(a, b); // call by value
        // copy function
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
    // public static void main(String[] args) {
    // int a = 4;
    // int b= 5;
    // sum();
    // System.out.println(sum);
    // }
}
