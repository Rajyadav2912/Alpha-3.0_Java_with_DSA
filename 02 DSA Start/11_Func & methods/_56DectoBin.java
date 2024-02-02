
public class _56DectoBin {
    public static int DectoBin(int DecNum) {
        int Mynum = DecNum;
        int Pow = 0;
        int BinNum = 0;
        while (DecNum > 0) {
            int rem = DecNum % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, Pow));
            /*
             * Decimal To Binary (int ) <-- that means Type casting
             * [ BinNum = BinNum + (rem * 10^2) ]
             */
            Pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("Binary num is :" + Mynum + " = " + BinNum);
        return BinNum;
    }

    public static void main(String[] args) {
        DectoBin(5);
    }
}
