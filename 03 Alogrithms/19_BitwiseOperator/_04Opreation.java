
public class _04Opreation {

    public static int GetIthBit(int n, int i) {
        int Bitmask = 1 << i;
        if ((n & Bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetIthBit(int n, int i) {
        int Bitmask = 1 << i;
        return n | Bitmask;
    }

    public static int ClearIthBit(int n, int i) {
        int Bitmask = ~(1 << i);
        return n & Bitmask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return ClearIthBit(n, i);
        } else {
            return SetIthBit(n, i);
        }

        // 2nd Approach

        // n = ClearIthBit(n, i);
        // int Bitmask = newBit << i;
        // return n | Bitmask;
    }

    public static int ClearLastIthBit(int n, int i) {
        int Bitmask = (~0) << i;
        return n & Bitmask;
    }

    public static int ClearIthBitinRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int Bitmask = a | b;
        return n & Bitmask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // System.out.println(GetIthBit(5, 0));
        // System.out.println(SetIthBit(10, 2));
        // System.out.println(ClearIthBit(10, 3));
        // System.out.println(UpdateIthBit(10, 2, 1));
        // System.out.println(ClearLastIthBit(10, 1));
        // System.out.println(ClearIthBitinRange(15, 1, 3));
        System.out.println(isPowerOfTwo(10));
    }
}
