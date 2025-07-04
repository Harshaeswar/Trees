public class SymmetricTree {

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

    public static boolean isSymmetric(Node root) {
        return find(root.left, root.right);
    }

    public static boolean find(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        return find(root1.left, root2.right) && find(root1.right, root2.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2, new Node(3), new Node(4));
        root.right = new Node(2, new Node(4), new Node(3));

        boolean result = isSymmetric(root);
        System.out.println(result);
    }
}
