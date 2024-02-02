import java.util.Stack;

public class _06Reverse_Stack {
    public static void PushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    public static void ReverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        ReverseStack(s);
        PushAtBottom(s, top);
    }

    public static void PrintStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        PrintStack(s);
        ReverseStack(s);
        PrintStack(s);
    }
}
