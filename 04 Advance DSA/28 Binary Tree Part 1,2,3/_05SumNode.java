public class _05SumNode {
    public static class Node {
        int data;
        Node left = null;
        Node right = null; 

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
    public int Sum(Node root) {
        if (root == null) {
            return 0;
        }

        int LS = Sum(root.left);
        int RS = Sum(root.right);

        return LS + RS + root.data;
    }

    public static void main(String[] args) {
        _05SumNode sum = new _05SumNode();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sum.Sum(root)); // Sum = 28
    }
}
