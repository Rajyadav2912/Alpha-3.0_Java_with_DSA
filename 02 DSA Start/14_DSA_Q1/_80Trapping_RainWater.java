
public class _80Trapping_RainWater {
    public static int Trapping_RainWater(int height[]) {
        int size = height.length;
        // Cal. Left max boundry
        int left_max[] = new int[size];
        left_max[0] = height[0];
        for (int i = 1; i < size; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        // Cal. right max boundry
        int right_max[] = new int[size];
        right_max[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        // Loop
        int Trapping_RainWater = 0;
        for (int i = 0; i < size; i++) {
            // waterlvl = min(Left Max , Right max)
            int water_level = Math.min(left_max[i], right_max[i]);
            Trapping_RainWater += water_level - height[i];
        }
        return Trapping_RainWater;
        // trapped += water levl - height
    }

    public static void main(String[] args) {
        // index ={0,1,2,3,4,5,6}
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Trapped Rain water : " + Trapping_RainWater(height));
    }
}
