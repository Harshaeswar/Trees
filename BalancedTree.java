public class BalancedTree {

    static class Node {
        int val;
        Node left;
        Node right;

        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isBalanced(Node root) {
        int ans = check(root);
        return ans != -1;
    }

    public static int check(Node root) {
        if (root == null) return 0;

        int l = check(root.left);
        if (l == -1) return -1;

        int r = check(root.right);
        if (r == -1) return -1;

        if (Math.abs(l - r) > 1) return -1;

        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(3);
        root.left.left.left = new Node(4);
        root.left.left.right = new Node(4);

        boolean result = isBalanced(root);
        System.out.println(result);
    }
}
