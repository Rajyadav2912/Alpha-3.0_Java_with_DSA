
public class _12MINDis {
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

    public static Node LCA(Node root, int n1, int n2) { // T.C = O(n) Linear time S.P = O(h) height
        // base case
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node LeftAns = LCA(root.left, n1, n2);
        Node RightAns = LCA(root.right, n1, n2);

        if (RightAns == null) {
            return LeftAns;
        }
        if (LeftAns == null) {
            return RightAns;
        }

        return root;
    }

    public static int LCADist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = LCADist(root.left, n);
        int rightDist = LCADist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public int MinDist(Node root, int n1, int n2) {
        Node lca = LCA(root, n1, n2);
        int dist1 = LCADist(lca, n1);
        int dist2 = LCADist(lca, n2);

        return dist1 + dist2;
    }

    public static void main(String[] args) {
        _12MINDis MinDis = new _12MINDis();
        Node root = MinDis.new Node(1);
        root.left = MinDis.new Node(2);
        root.right = MinDis.new Node(3);
        root.left.left = MinDis.new Node(4);
        root.left.right = MinDis.new Node(5);
        root.right.left = MinDis.new Node(6);
        root.right.right = MinDis.new Node(7);

        int n1 = 4, n2 = 6;
        System.out.println(MinDis.MinDist(root, n1, n2));
    }
}
