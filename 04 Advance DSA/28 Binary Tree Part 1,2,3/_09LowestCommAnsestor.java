import java.util.ArrayList;

public class _09LowestCommAnsestor {
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

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        // base case
        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if (foundleft || foundright) {
            return true;
        }

        path.remove(path.size() - 1);

        return false;
    }

    public Node LOWEST_COMMON_ANCESTOR(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        // Last common Ancestor

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // Last equal node -> i -1;
        Node LCA = path1.get(i - 1);
        return LCA;
    }

    public Node LCA(Node root, int n1, int n2) { // T.C = O(n) Linear time S.C = O(h) height

        // base case
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node LeftAns = LCA(root.left, n1, n2);
        Node RightAns = LCA(root.right, n1, n2);

        if (LeftAns != null && RightAns != null) {
            return root;
        }

        if (RightAns == null) {
            return LeftAns;
        }
        if (LeftAns == null) {
            return RightAns;
        }

        return root;
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         */
        _09LowestCommAnsestor Ansestor = new _09LowestCommAnsestor();
        Node root = Ansestor.new Node(1);
        root.left = Ansestor.new Node(2);
        root.right = Ansestor.new Node(3);
        root.left.left = Ansestor.new Node(4);
        root.left.right = Ansestor.new Node(5);
        root.right.left = Ansestor.new Node(6);
        root.right.right = Ansestor.new Node(7);

        // System.out.println(Ansestor.LOWEST_COMMON_ANCESTOR(root, 4, 7).data);
        System.out.println(Ansestor.LCA(root, 4, 6).data);

    }
}
