public class _13TileProblem {
    public static int TileingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // place vertically
        int Fnm1 = TileingProblem(n - 1);

        // place Horzontically
        int Fnm2 = TileingProblem(n - 2);
        int TotlWays = Fnm1 + Fnm2;

        return TotlWays;

        // return TileingProblem(n - 1) + TileingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(TileingProblem(4));
    }
}
