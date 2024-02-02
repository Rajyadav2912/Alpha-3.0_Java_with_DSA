import java.util.Stack;

public class _09Vaild_Parenthese {
    public static boolean isVaild(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening Brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // Closing Brackets
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "{(}";
        System.out.print(isVaild(str));
    }
}
