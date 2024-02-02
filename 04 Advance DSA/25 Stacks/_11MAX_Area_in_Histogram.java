import java.util.Stack;

public class _11MAX_Area_in_Histogram {
    public static void Max_AreaHistogram(int arr[]) {
        int Max_Area = 0;
        int Nxt_Small_Left[] = new int[arr.length];
        int Nxt_Small_Right[] = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                Nxt_Small_Right[i] = arr.length;
            } else {
                Nxt_Small_Right[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                Nxt_Small_Left[i] = -1;
            } else {
                Nxt_Small_Left[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area
        for (int i = 0; i < arr.length; i++) {
            int Heights = arr[i];
            int Width = Nxt_Small_Right[i] - Nxt_Small_Left[i] - 1;
            int CurrArea = Heights * Width;
            Max_Area = Math.max(Max_Area, CurrArea);
        }

        System.out.println("Max Area in Histogram : " + Max_Area);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // Heights in Histogram
        Max_AreaHistogram(arr);
    }
}
