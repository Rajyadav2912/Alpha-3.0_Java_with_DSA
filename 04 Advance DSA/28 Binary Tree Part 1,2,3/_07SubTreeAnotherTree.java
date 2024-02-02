
public class _07SubTreeAnotherTree {
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

    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        }

        else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        if (!isIdentical(node.left, subroot.left)) {
            return false;
        }

        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }

        return true;
    }

    public boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        boolean LeftAns = isSubtree(root.left, subroot);
        boolean RightAns = isSubtree(root.right, subroot);

        return LeftAns || RightAns;
    }

    public static void main(String[] args) {

        _07SubTreeAnotherTree Tree = new _07SubTreeAnotherTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(Tree.isSubtree(root, subroot));
    }
}
