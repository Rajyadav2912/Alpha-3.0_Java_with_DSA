
public class _13KAncestor {
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

    public int KAncestor(Node root, int n, int k) {
        // base case
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);

        if (max + 1 == k) {
            System.out.println(root.data);
            // return root.data;
        }

        return max + 1;
    }

    public static void main(String[] args) {
        _13KAncestor KAnces = new _13KAncestor();
        Node root = KAnces.new Node(1);
        root.left = KAnces.new Node(2);
        root.right = KAnces.new Node(3);
        root.left.left = KAnces.new Node(4);
        root.left.right = KAnces.new Node(5);
        root.right.left = KAnces.new Node(6);
        root.right.right = KAnces.new Node(7);

        int n = 5, k = 2;
        System.out.println(KAnces.KAncestor(root, n, k));
    }
}
