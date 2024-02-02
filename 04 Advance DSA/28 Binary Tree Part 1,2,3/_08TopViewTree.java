/*
//  * 1. Create a class Node that represent nodes of B-T:
//    - data: int
//    - left: reference to the left child Node
//    - right: reference to the right child Node

// 2. Create a static class Info to store node and horizontal distance (hd) for level order traversal:
//    - node: reference to a Node
//    - hd: horizontal distance from the root node

// 3. Create a function topView(root) to print the top view of the binary tree:
//    Input: root (Node) - The root of the binary tree

//    - Initialize a Queue q for level order traversal and a HashMap map to store nodes at each horizontal distance.
//    - Initialize MIN and MAX variables to track the minimum and maximum horizontal distances encountered.

//    - Add a new Info object with root node and hd = 0 to the queue q.
//    - Add null to the queue to mark the end of a level.

//    - While the queue is not empty:
//       - Dequeue the front element from the queue and store it in the variable curr.
//       - If curr is null:
//          - If the queue is empty, break the loop, as all nodes have been traversed.
//          - Otherwise, add null to the queue to mark the end of the next level.
//       - Otherwise (curr is not null):
//          - If the horizontal distance curr.hd is not present in the map:
//             - Add curr.hd and curr.node to the map.

//          - If curr.node has a left child:
//             - Add a new Info object with the left child and hd = curr.hd - 1 to the queue.
//             - Update MIN if curr.hd - 1 is smaller than MIN.

//          - If curr.node has a right child:
//             - Add a new Info object with the right child and hd = curr.hd + 1 to the queue.
//             - Update MAX if curr.hd + 1 is greater than MAX.

//    - Print the nodes in the top view using the map and the range [MIN, MAX].
//    - End the function.

// 4. Create a new instance of the binary tree class _08TopViewTree:
//    - root = Node(1)
//    - root.left = Node(2)
//    - root.right = Node(3)
//    - root.left.left = Node(4)
//    - root.left.right = Node(5)
//    - root.right.left = Node(6)
//    - root.right.right = Node(7)

// 5. Call the topView(root) function with the root of the binary tree as an argument.

// 6. End of the program.

 */

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class _08TopViewTree {
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

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void topView(Node root) {
        // Level Order Logic

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int MIN = 0, MAX = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    MIN = Math.min(MIN, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    MAX = Math.max(MAX, curr.hd + 1);
                }
            }
        }

        for (int i = MIN; i <= MAX; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _08TopViewTree Tree = new _08TopViewTree();
        Node root = Tree.new Node(1);
        root.left = Tree.new Node(2);
        root.right = Tree.new Node(3);
        root.left.left = Tree.new Node(4);
        root.left.right = Tree.new Node(5);
        root.right.left = Tree.new Node(6);
        root.right.right = Tree.new Node(7);

        Tree.topView(root);
    }
}

/*
 * Optimize this code
 * import java.util.*;
 * 
 * public class _08TopViewTree {
 * public class Node {
 * int data;
 * Node left;
 * Node right;
 * 
 * public Node(int data) {
 * this.data = data;
 * this.left = null;
 * this.right = null;
 * }
 * }
 * 
 * static class Info {
 * Node node;
 * int hd;
 * 
 * public Info(Node node, int hd) {
 * this.node = node;
 * this.hd = hd;
 * }
 * }
 * 
 * public void topView(Node root) {
 * if (root == null) {
 * return;
 * }
 * 
 * // Use TreeMap to automatically sort keys based on hd
 * TreeMap<Integer, Node> map = new TreeMap<>();
 * Queue<Info> q = new LinkedList<>();
 * 
 * q.add(new Info(root, 0));
 * 
 * while (!q.isEmpty()) {
 * Info curr = q.remove();
 * int hd = curr.hd;
 * Node node = curr.node;
 * 
 * if (!map.containsKey(hd)) {
 * map.put(hd, node);
 * }
 * 
 * if (node.left != null) {
 * q.add(new Info(node.left, hd - 1));
 * }
 * if (node.right != null) {
 * q.add(new Info(node.right, hd + 1));
 * }
 * }
 * 
 * for (Node node : map.values()) {
 * System.out.print(node.data + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void main(String[] args) {
 * _08TopViewTree Tree = new _08TopViewTree();
 * Node root = Tree.new Node(1);
 * root.left = Tree.new Node(2);
 * root.right = Tree.new Node(3);
 * root.left.left = Tree.new Node(4);
 * root.left.right = Tree.new Node(5);
 * root.right.left = Tree.new Node(6);
 * root.right.right = Tree.new Node(7);
 * 
 * Tree.topView(root);
 * }
 * }
 * 
 */
