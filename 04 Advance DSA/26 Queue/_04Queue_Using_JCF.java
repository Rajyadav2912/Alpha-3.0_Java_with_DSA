import java.util.ArrayDeque;// ArrayDeque package import
// import java.util.LinkedList; // LinkedList package import
// import java.util.Queue; // Queue package import
import java.util.*; // ALL package import

public class _04Queue_Using_JCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
