public class _02AddFirst {
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

    public static void main(String[] args) {
        _02AddFirst LL = new _02AddFirst();
        LL.Print();
        LL.addFirst(2);
        LL.Print();
        LL.addFirst(1);
        LL.Print();
    }
}
