/*
 * 1. Create a class Node to represent the nodes of the binary tree:
   - data: integer
   - left: reference to the left child Node
   - right: reference to the right child Node

2. Create a function findKthLevel(root, Kth) to find the Kth level node in the binary tree:
   Input: root (Node) - The root of the binary tree
          Kth (integer) - The level to find

   - If root is null or Kth is less than or equal to 0, return null.
   - If Kth is 1, return the root node.

   - Recursively call findKthLevel with root.left and Kth - 1, and store the result in leftKth.
   - If leftKth is not null, return leftKth.

   - Otherwise, recursively call findKthLevel with root.right and Kth - 1, and return the result.

3. Create a function KthLVL(root, Kth) to print the data of the Kth level node:
   Input: root (Node) - The root of the binary tree
          Kth (integer) - The level to find

   - Find the Kth level node using the findKthLevel function and store it in kthNode.
   - If kthNode is not null, print kthNode.data.
   - Otherwise, print "Kth level not found."

4. Create a new binary tree with the given nodes and connections.
5. Call the KthLVL function with the root of the binary tree and the desired Kth level as arguments.
6. End of the program.

 */
public class _04KthLevel {
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

    public static void KthLVL(Node root, int LVL, int Kth) {
        if (root == null) {
            return;
        }
        if (LVL == Kth) {
            System.out.println(root.data + " ");
            return;
        }

        KthLVL(root.left, LVL + 1, Kth);
        KthLVL(root.right, LVL + 1, Kth);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int Kth = 3;

        KthLVL(root, 1, Kth);
    }
}
