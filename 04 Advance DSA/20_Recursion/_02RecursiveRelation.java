
public class _02RecursiveRelation {
    public static void RecursiveRelation(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        RecursiveRelation(n - 1);
    }

    public static void main(String[] args) {
        RecursiveRelation(5);
    }
}
