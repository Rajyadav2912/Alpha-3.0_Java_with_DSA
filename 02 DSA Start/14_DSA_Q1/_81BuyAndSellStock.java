
public class _81BuyAndSellStock {
    public static int BuyandSellStock(int Price[]) {
        int Buy_Price = Integer.MAX_VALUE;
        int Max_Profit = 0;
        for (int i = 0; i < Price.length; i++) {
            if (Buy_Price < Price[i]) {
                int Profit = Price[i] - Buy_Price;
                Max_Profit = Math.max(Max_Profit, Profit);
            } else {
                Buy_Price = Price[i];
            }
        }
        return Max_Profit;
    }

    public static void main(String[] args) {
        int Price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyandSellStock(Price));
    }
}
