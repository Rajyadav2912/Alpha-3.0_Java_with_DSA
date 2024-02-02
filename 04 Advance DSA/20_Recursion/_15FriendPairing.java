public class _15FriendPairing {
    public static int FriendsPairing(int n) {
        // bae case
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        // choices
        // single
        int fnm1 = FriendsPairing(n - 1);

        // pair
        int fnm2 = FriendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // Total pair
        int TotalPair = fnm1 + pairWays;
        return TotalPair;
    }

    public static int FriendsPairing1(int n) {
        // bae case
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return FriendsPairing(n - 1) + (n - 1) * FriendsPairing(n - 2);
    }

    public static void main(String[] args) {
        /*
         * n = 2 pairways = 2
         * n = 3 pairways = 4
         * n = 4 pairways = 10
         * n = 5 pairways = 26
         */
        System.out.println(FriendsPairing(4));
        System.out.println(FriendsPairing1(2));
        System.out.println(FriendsPairing1(3));
        System.out.println(FriendsPairing1(5));
    }
}
