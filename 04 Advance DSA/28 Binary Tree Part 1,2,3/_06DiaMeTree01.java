public class _06DiaMeTree01 {
    public static class Node { // O(n^2)
        int data;
        Node left = null;
        Node right = null;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) { // O(n) Linear
        if (root == null) {
            return 0;
        }

        int LH = height(root.left);
        int RH = height(root.right);

        return Math.max(LH, RH) + 1;
    }

    // Approch - 1
    public static int DiameterTree(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }

        int LeftDia = DiameterTree(root.left);
        int LeftHT = height(root.left);
        int RightDia = DiameterTree(root.right);
        int RightHT = height(root.right);

        int selfDia = LeftHT + RightHT + 1;

        return Math.max(selfDia, Math.max(LeftDia, RightDia));
    }

    // Approch - 2
    static class Info {
        int Diam;
        int HT;

        public Info(int Diam, int HT) {
            this.Diam = Diam;
            this.HT = HT;
        }
    }

    public static Info InfoDiameter(Node root) { // O(n) Linear
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = InfoDiameter(root.left);
        Info rightInfo = InfoDiameter(root.right);

        int Diam = Math.max(Math.max(leftInfo.Diam, rightInfo.Diam), leftInfo.HT + rightInfo.HT + 1);
        int HT = Math.max(leftInfo.HT, rightInfo.HT) + 1;

        return new Info(Diam, HT);
    }

    public static void main(String[] args) {
        /*
         ** 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        // root.left.right.left = new Node(7);
        // root.right.right.right = new Node(8);

        // System.out.println(DiameterTree(root));
        System.out.println(InfoDiameter(root).Diam);
        System.out.println(InfoDiameter(root).HT);
    }
}
