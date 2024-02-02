public class _07ClimbStair {
    public int ClimbStair(long staircase) {
        // base case
        if (staircase < 0) {
            return 0;
        }
        if (staircase == 0) {
            return 1;
        }

        // R.C
        return ClimbStair(staircase - 1) + ClimbStair(staircase - 2);
    }

    public static void main(String[] args) {
        // long staircase = 2;
        // ClimbStair(staircase);
    }
}
