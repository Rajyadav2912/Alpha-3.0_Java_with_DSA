import java.util.Stack;

public class _08Next_Greater_Element {
    public static void main(String[] args) {
        // int arr[] = { 6, 8, 0, 1, 3 }; // Next Greater Element = 8 -1 1 3 -1
        int arr[] = { 5, 7, 3, 5 }; // Next Greater Element = -1
        Stack<Integer> s = new Stack<>();

        int Nxt_Greater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2 if else
            if (s.isEmpty()) {
                Nxt_Greater[i] = -1;
            } else {
                Nxt_Greater[i] = arr[s.peek()];
            }
            // 3 push
            s.push(i);
        }
        for (int i = 0; i < Nxt_Greater.length; i++) {
            System.out.print(Nxt_Greater[i] + " ");
        }
        System.out.println();
    }
}
