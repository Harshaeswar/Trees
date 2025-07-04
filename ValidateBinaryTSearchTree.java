/**
 * Definition for a binary tree node.
 */
class Node {
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

class ValidateBinarySearchTree {
    public boolean isValidBST(Node root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(Node node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return isValid(node.left, min, node.val) &&
               isValid(node.right, node.val, max);
    }
}

public class ValidateBinaryTSearchTree {
    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3, new Node(2), new Node(4));
        root.right = new Node(7, null, new Node(8));

        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        boolean result = validator.isValidBST(root);

        System.out.println("Is the tree a valid BST? " + result);
    }
}
