import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class _10ZigzagTraversal {
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

    public ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();

            ArrayList<Integer> result = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node temp = q.remove();

                result.add(temp.data);

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            if (!leftToRight) {
                Collections.reverse(result);
            }
            leftToRight = !leftToRight;

            ans.addAll(result);
        }
        return ans;
    }

    public static void main(String[] args) {
        _10ZigzagTraversal zigZag = new _10ZigzagTraversal();
        Node root = zigZag.new Node(1);
        root.left = zigZag.new Node(2);
        root.right = zigZag.new Node(3);
        root.left.left = zigZag.new Node(4);
        root.left.right = zigZag.new Node(5);
        root.right.left = zigZag.new Node(6);
        root.right.right = zigZag.new Node(7);

        System.out.println(zigZag.zigZagTraversal(root));
    }
}
