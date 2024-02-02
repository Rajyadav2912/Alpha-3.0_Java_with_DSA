public class _48product {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int prod = multiply(a, b);

        System.out.println("a * b = " + prod); // a * b = 15
        prod = multiply(10, 40); // a * b = 400
        System.out.println("a * b = " + prod);
    }
}
