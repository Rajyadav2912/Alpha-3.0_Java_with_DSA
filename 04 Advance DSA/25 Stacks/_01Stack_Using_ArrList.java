import java.util.ArrayList;

public class _01Stack_Using_ArrList {
    static class Stack {
        static ArrayList<Integer> List = new ArrayList<>();

        public boolean isEmpty() {
            return List.size() == 0;
        }

        // push
        public void push(int data) {
            List.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = List.get(List.size() - 1);
            List.remove(List.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return List.get(List.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        // s.pop();
    }
}
