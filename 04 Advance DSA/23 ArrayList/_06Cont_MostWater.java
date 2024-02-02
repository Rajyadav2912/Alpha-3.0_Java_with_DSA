import java.util.ArrayList;

public class _06Cont_MostWater {

    public static void CountWithMostWater(ArrayList<Integer> Height) {

        // Time Complexity = O(n^2)

        int MaximumHeight = Integer.MIN_VALUE;

        for (int i = 0; i < Height.size(); i++) {
            for (int j = i + 1; j < Height.size(); j++) {
                int HT = Math.min(Height.get(i), Height.get(j));
                int WDT = j - i;
                int CurrHT = WDT * HT;
                MaximumHeight = Math.max(MaximumHeight, CurrHT);
            }
        }
        System.out.println("Maximum height of fill water is: " + MaximumHeight);
    }

    public static void CountWithMostWater2PApp(ArrayList<Integer> Height) {

        // Time Complexity = O(n)

        int MaximumHeight = Integer.MIN_VALUE;
        int LeftPart = 0;
        int RightPart = Height.size() - 1;

        while (LeftPart < RightPart) {
            int HT = Math.min(Height.get(LeftPart), Height.get(RightPart));
            int WDT = RightPart - LeftPart;
            int CurrHT = HT * WDT;
            MaximumHeight = Math.max(MaximumHeight, CurrHT);

            if (LeftPart < RightPart) {
                LeftPart++;
            } else {
                RightPart--;
            }
        }

        System.out.println(MaximumHeight);
    }

    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        // CountWithMostWater(Height);

        CountWithMostWater2PApp(Height);
    }
}
