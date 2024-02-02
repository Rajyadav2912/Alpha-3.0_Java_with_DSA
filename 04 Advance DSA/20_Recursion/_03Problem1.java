//  print Decending order
//  print Aecending order
public class _03Problem1 {
    public static void recursivefunctionDecen(int n) {
        if (n == 0) { // Base case
            return;
        }

        System.out.print(n + " ");
        recursivefunctionDecen(n - 1);
    }

    public static void recursivefunctionAecen(int n) {
        if (n == 0) { // Base case
            return;
        }

        recursivefunctionAecen(n - 1);
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        recursivefunctionDecen(10);
        recursivefunctionAecen(10);

    }
}
