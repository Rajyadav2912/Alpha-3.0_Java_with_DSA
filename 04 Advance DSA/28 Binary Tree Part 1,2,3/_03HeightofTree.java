public class _03HeightofTree {
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

    public int height(Node root) { // O(n) Linear
        if (root == null) {
            return 0;
        }

        int LH = height(root.left);
        int RH = height(root.right);

        return Math.max(LH, RH) + 1;
    }

    public static void main(String[] args) {
        /*
         ** 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        _03HeightofTree tree = new _03HeightofTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(tree.height(root)); // Height = 3
    }
}
