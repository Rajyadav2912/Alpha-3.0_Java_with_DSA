public class _04DectectAndRemoveCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    /*
     * public static boolean IsCycle() { // Floyd's Cycle Finding Algorithm
     * // Node Slow = head;
     * // Node Fast = head;
     * 
     * // while (Fast != null && Fast.next != null) {
     * // Slow = Slow.next; // +1 agee badega
     * // Fast = Fast.next.next; // +2 agee badega
     * 
     * // if (Slow == Fast) { // when both are equal
     * // return true; // when cycle is exists - Ans true
     * // }
     * // }
     * 
     * // return false; // when cycle is does'nt exists - Ans false
     * // }
     */

    public static boolean IsCycle() {
        Node Slow = head;
        Node Fast = head;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
            if (Slow == Fast) {
                return true;
            }
        }
        return false;
    }

    public static void RemoveCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 badega
            fast = fast.next.next; // +2 badega

            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null; // Last node

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle --> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        // IsCycle();

        // head = new Node(1); // 1 -> 2 -> 3 -> 1
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = head; // 1->2->3->4->-5->1
        // System.out.println(IsCycle()); // RemoveCycle();

        head = new Node(1); // 1->2->3->2
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println("Cycle is exists : " + IsCycle()); // when Cycle is exists: true
        RemoveCycle();
        System.out.println("Cycle is remove : " + IsCycle()); // when Cycle is remove: false
    }
}
