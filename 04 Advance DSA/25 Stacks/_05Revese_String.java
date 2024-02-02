import java.util.Stack;

public class _05Revese_String {
    public static String ReverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String result = ReverseString(str);
        System.out.println(result); // cba is Reverse String
    }
}
