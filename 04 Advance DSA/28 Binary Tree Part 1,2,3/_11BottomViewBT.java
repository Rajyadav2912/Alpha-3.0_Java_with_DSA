// import java.util.*;
// import java.util.LinkedList;
// import java.util.ArrayList;

// public class _11BottomViewBT {
// public class Node {
// int data;
// Node left;
// Node right;

// public Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class Info {
// Node node;
// int hd;

// public Info(Node node, int hd) {
// this.node = node;
// this.hd = hd;
// }
// }

// public ArrayList<Integer> bottomView(Node root) {
// ArrayList<Integer> ans = new ArrayList();

// if (root == null) {
// return ans;
// }

// Queue<Info> q = new ArrayDeque();
// HashMap<Integer, Integer> map = new HashMap();

// q.add(new Info(0, root));

// while (!q.isEmpty()) {
// Info curr = q.poll();

// if (map.containsKey(curr.hd)) {
// map.put(curr.hd, curr.node.data);
// } else {
// map.put(curr.hd, curr.node.data);
// }

// if (curr.node.left != null) {
// q.add(new Info(curr.hd - 1, curr.node.left));
// }
// if (curr.node.right != null) {
// q.add(new Info(curr.hd + 1, curr.node.right));
// }
// }

// for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
// ans.add(entry.getValue());
// }

// return ans;
// }

// public static void main(String[] args) {
// _11BottomViewBT bottomView = new _11BottomViewBT();
// Node root = bottomView.new Node(1);
// root.left = bottomView.new Node(2);
// root.right = bottomView.new Node(3);
// root.left.left = bottomView.new Node(4);
// root.left.right = bottomView.new Node(5);
// root.right.left = bottomView.new Node(6);
// root.right.right = bottomView.new Node(7);

// System.out.println(bottomView.bottomView(root));
// }
// }
