
// Using Java Collection Framework 
import java.util.LinkedList;

public class _05JCF_InLinkedlist {
    public static void main(String[] args) {

        // Create Linkedlist
        LinkedList<Integer> LL = new LinkedList<>();

        // add LL
        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(0);

        System.out.println("LinkedList: " + LL); // [0, 1, 2]
        // remove in LL
        LL.removeFirst();
        System.out.println("RemoveFirst: " + LL); // [1, 2]
        LL.removeLast();
        System.out.println("RemoveLast: " + LL); // [1]
        LL.removeLast();
        System.out.println("RemoveLast: " + LL); // []
    }
}
