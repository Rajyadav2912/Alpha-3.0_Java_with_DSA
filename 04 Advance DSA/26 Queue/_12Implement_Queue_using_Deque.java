import java.util.Deque;
import java.util.LinkedList;

public class _12Implement_Queue_using_Deque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Peek: " + q.peek()); // 1
        System.out.println(q.remove()); // 1
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3
        System.out.println(q.remove()); // 4
        System.out.println(q.remove()); // 5
    }
}
