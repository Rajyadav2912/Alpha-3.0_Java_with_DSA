public class _07ZigZagLL {
    public static class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        // step 1 : create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 : new Node next = head
        newNode.next = head;
        // step 3 : head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void Print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void ZigZag() {
        // Find Mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node Mid = slow;

        // Reverse 2nd Half
        Node curr = Mid.next;
        Mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate merge = ZigZag Form
        while (left != null && right != null) {
            // Create Zig-Zag Form
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // Updates Node
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        _07ZigZagLL LL = new _07ZigZagLL();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.addLast(6);
        LL.Print(); // 1->2->3->4->5->6->null
        LL.ZigZag(); // call Zig-Zag function
        LL.Print(); // 1->6->2->5->3->4->null
    }
}
