import java.util.*;
import java.util.LinkedList;
// import java.util.Queue;

public class _01BinaryTreeB {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int Idx = -1;

        public Node BuildTree(int nodes[]) {
            Idx++;
            if (nodes[Idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[Idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }

    // Pre-Order
    public static void preorder(Node root) { // O (n) Linear
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // In-Order
    public static void inorder(Node root) { // O (n) Linear
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Post-Order
    public static void postorder(Node root) { // O (n) Linear
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void Levelorder(Node root) { // O (n) Linear
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println(" ");

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + ",");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree Tree = new BinaryTree();
        Node root = Tree.BuildTree(nodes);
        // System.out.println(root.data);
        // preorder(root); // 1 2 4 5 3 6
        // inorder(root); // 4 2 5 1 3 6
        // postorder(root); // 4 5 2 6 3 1
        Levelorder(root);
        /*
         * 1
         * 2 3
         * 4 5 6
         */
    }
}
