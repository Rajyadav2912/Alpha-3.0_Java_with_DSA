
public class _14SumTree {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int Transform(Node root) {
        if (root == null) {
            return 0;
        }

        int Leftchild = Transform(root.left);
        int Rightchild = Transform(root.right);

        int data = root.data;
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newleft + Leftchild + newright + Rightchild;

        return data;
    }

    public static void Preoder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        Preoder(root.left);
        Preoder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        // 1
        // 27 9 0 0 13 0 0

        _14SumTree TransSumtree = new _14SumTree();
        Node root = TransSumtree.new Node(1);
        root.left = TransSumtree.new Node(2);
        root.right = TransSumtree.new Node(3);
        root.left.left = TransSumtree.new Node(4);
        root.left.right = TransSumtree.new Node(5);
        root.right.left = TransSumtree.new Node(6);
        root.right.right = TransSumtree.new Node(7);

        System.out.println(TransSumtree.Transform(root));
        Preoder(root);
    }
}
