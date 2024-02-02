public class _44CharPattern {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
// A
// B C
// D E F
// G H I J A = 65 a = 97
// Z = 25 z = 12
