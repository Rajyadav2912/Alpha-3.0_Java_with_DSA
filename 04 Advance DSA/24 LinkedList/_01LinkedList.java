public class _01LinkedList {
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
    public int size;

    /*
     * Methods :- add(), remove() , search() , print()
     */
    // add first Time Complexity - O(n) constant time
    public void addFirst(int data) {
        // step 1 - create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 -newNode next = head
        newNode.next = head; // link

        // step 3 - head = newNode
        head = newNode;
    }

    // add last Time Complexity - O(n) constant time
    public void addLast(int data) {
        // step 1 - create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - tail.next = head
        tail.next = newNode;

        // step 3 - tail = newNode
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

    public void addNode(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx - 1 ; temp -> prev

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is epmty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;

        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is epmty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;

        }

        // prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int value = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key is found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key is not found
        return -1;
    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int RecusiveSearch(int key) {
        return helper(head, key);
    }

    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthNode(int Nth) {
        // Calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++; // 5
        }

        if (Nth == size) {
            head = head.next; // removeFirst
            return;
        }

        // size - Nth

        int i = 1;
        int iTofind = size - Nth;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Slow - Fast Approach
    private Node FindMid(Node head) {
        Node slow = head; // +1
        Node fast = head; // +2

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow;
    }

    public boolean CheckPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step1 - find mid
        Node midNode = FindMid(head); // call find mid

        // step 2 - reverse 2nd half
        Node curr = midNode;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // xtep 3 - check left half
        while (right != null) {
            if (left.data == right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        _01LinkedList LL = new _01LinkedList();
        // LL.head = new Node(1);
        // LL.head.next = new Node(2);
        // LL.addFirst(2);
        // LL.addFirst(1);
        // LL.addLast(4);
        // LL.addLast(5);
        // LL.addNode(2, 3);
        // LL.Print(); // 1->2->3->4->5->null
        // System.out.println("LinkedList Size is : " + LL.size); // 5
        // System.out.println();

        // LL.removeFirst();
        // LL.Print(); // 2->3->4->5->null
        // System.out.println("LinkedList Size is : " + LL.size); // 4
        // System.out.println();

        // LL.removeLast(); // 2->3->4->null
        // LL.Print();
        // System.out.println("LinkedList Size is : " + LL.size); // 3

        /*
         * System.out.println("LL in Search No. is 4 : " + LL.search(4) + " index");
         * LL in Search No. is 4 : 3 index
         * 
         * System.out.println("LL in Search No. is 5 : " + LL.search(5) + " index");
         * LL in Search No. is 5 : 4 index
         * 
         * System.out.println("LL in Search No. is 10 : " + LL.search(10) + " index");
         * LL in Search No. is 10 : -1 index
         */

        // System.out.println("Index : " + LL.RecusiveSearch(5));
        // LL.Reverse();
        // LL.Print();

        // LL.removeNthNode(2);
        // LL.Print();

        LL.addFirst(2);
        LL.addFirst(1);
        LL.addLast(1);
        LL.Print(); // 1->2->1->null
        System.out.println(LL.CheckPalindrome()); // true
    }
}
