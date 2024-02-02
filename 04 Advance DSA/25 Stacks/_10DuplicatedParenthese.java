import java.util.Stack;

public class _10DuplicatedParenthese {
    public static boolean DuplicateParenthese(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // for closing
            if (ch == ')') {
                int Count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    Count++;
                }

                if (Count < 1) {
                    return true; // when Parenthese is Duplicate retn True
                } else {
                    s.pop(); // check Opening Pair
                }
            } else {
                // Opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)";
        System.out.println(DuplicateParenthese(str));
    }
}
