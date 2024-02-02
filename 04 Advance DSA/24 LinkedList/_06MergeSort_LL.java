
public class _06MergeSort_LL {
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

    /*
     * Methods :- add(), remove() , search() , print()
     */
    // add first Time Complexity - O(n) constant time
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

    // public Node GetMid(Node head) {
    // Node slow = head;
    // Node fast = head.next;

    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // return slow; // I know mid is find
    // }

    // public Node Merge(Node head1, Node head2) {
    // Node MergedLL = new Node(-1);
    // Node temp = MergedLL;

    // while (head1 != null && head2 != null) {
    // if (head1.data <= head2.data) {
    // temp.next = head1;
    // head1 = head1.next;
    // temp = temp.next;
    // } else {
    // temp.next = head2;
    // head2 = head2.next;
    // temp = temp.next;
    // }
    // }

    // while (head1 != null) {
    // temp.next = head1;
    // head1 = head1.next;
    // temp = temp.next;
    // }

    // while (head2 != null) {
    // temp.next = head2;
    // head2 = head2.next;
    // temp = temp.next;
    // }

    // return MergedLL.next;
    // }

    // public Node MergeSort(Node head) {
    // // base case
    // if (head == null || head.next == null) {
    // return head;
    // }

    // Node Mid = GetMid(head);

    // Node rightHead = Mid.next;
    // Mid.next = null;
    // Node newLeft = MergeSort(head);
    // Node newRight = MergeSort(rightHead);

    // return Merge(newLeft, newRight);
    // }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node Merge(Node Left, Node Right) {
        Node AnsLL = new Node(-1);
        Node temp = AnsLL;

        if (Left == null) {
            return Right;
        }

        if (Right == null) {
            return Left;
        }

        while (Left != null && Right != null) {
            if (Left.data < Right.data) {
                temp.next = Left;
                Left = Left.next;
                temp = temp.next;
            } else {
                temp.next = Right;
                Right = Right.next;
                temp = temp.next;
            }
        }

        while (Left != null) {
            temp.next = Left;
            Left = Left.next;
            temp = temp.next;
        }

        while (Right != null) {
            temp.next = Right;
            Right = Right.next;
            temp = temp.next;
        }

        return AnsLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node Mid = findMid(head);
        Node RightHead = Mid.next;
        Mid.next = null;

        Node Left = mergeSort(head);
        Node Right = mergeSort(RightHead);

        return Merge(Left, Right);
    }

    public static void main(String[] args) {
        _06MergeSort_LL LL = new _06MergeSort_LL();
        LL.addFirst(4);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(1);
        LL.addFirst(5);

        LL.Print(); // 5->4->3->2->1->null
        LL.head = LL.mergeSort(LL.head);
        LL.Print(); // 1->2->3->4->5->null
    }
}
