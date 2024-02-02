public class _08DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // addFirst

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty : ");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty: ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void ReverseDoublyLL() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        _08DoublyLL DLL = new _08DoublyLL();
        DLL.addFirst(3);
        DLL.addFirst(2);
        DLL.addFirst(1);
        DLL.addLast(4);
        DLL.print(); // 1<->2<->3<->4<->null
        System.out.println("SIZE: " + DLL.size); // SIZE: 4
        // DLL.removeFirst();
        DLL.addLast(5);
        System.out.print("ADD 5 in Last: "); // ADD 5 in Last: 1<->2<->3<->4<->5<->null
        DLL.print(); // 1<->2<->3<->4<->5<->null
        System.out.println("SIZE: " + DLL.size); // SIZE: 5
        DLL.removeLast();
        System.out.print("REMOVE 5 in Last: "); // REMOVE 5 in Last: 1<->2<->3<->4<->null
        DLL.print();
        System.out.println("SIZE: " + DLL.size); // SIZE: 4
        DLL.ReverseDoublyLL();
        DLL.print(); // 4<->3<->2<->1<->null
        System.out.println("SIZE: " + DLL.size);// SIZE: 4
    }
}