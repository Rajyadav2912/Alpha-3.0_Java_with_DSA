public class _55BinToDec {
    public static int BinToDec(int BinNum) {
        int Mynum = BinNum;
        int pow = 0;
        int dec = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            /*
             * Binary to decimal (int) <-- that means type casting
             * [ dec = dec + (last digit * 2^10); ]
             * 
             */
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.print("Decimal is " + Mynum + " = " + dec);
        return dec;
    }

    public static void main(String[] args) {
        BinToDec(111);
    }
}
