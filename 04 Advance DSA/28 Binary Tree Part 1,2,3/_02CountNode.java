public class _02CountNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int Count(Node root) {
        if (root == null) {
            return 0;
        }

        int LC = Count(root.left);
        int RC = Count(root.right);

        return (LC + RC) + 1;
    }

    public static void main(String[] args) {

        _02CountNode Count = new _02CountNode();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(Count.Count(root)); //Count = 6
    }
}
