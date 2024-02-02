import java.util.Deque;
import java.util.LinkedList;

public class _10Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque); // [2, 1, 3, 4]
        // deque.removeFirst();
        // System.out.println(deque); // [1, 3, 4]
        // deque.removeLast();
        // System.out.println(deque); // [1, 3]
        System.out.println("first ele: " + deque.getFirst()); // 2
        System.out.println("Last ele: " + deque.getLast()); // 4

    }
}
