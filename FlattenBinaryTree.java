public class FlattenBinaryTree {

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

    static Node prev = null;

    public static void flatten(Node root) {
        if (root != null) {
            flatten(root.right);
            flatten(root.left);
            root.right = prev;
            root.left = null;
            prev = root;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2, new Node(3), new Node(4));
        root.right = new Node(5, null, new Node(6));

        flatten(root);

        Node curr = root;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }
}
