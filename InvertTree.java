public class InvertTree {

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

    public static Node invertTree(Node root) {
        if (root != null) {
            Node temp = root.right;
            root.right = root.left;
            root.left = temp;
            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2, new Node(1), new Node(3));
        root.right = new Node(7, new Node(6), new Node(9));

        root = invertTree(root);
        printInOrder(root);
    }

    public static void printInOrder(Node root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
