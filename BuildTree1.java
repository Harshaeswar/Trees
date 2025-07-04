public class BuildTree1 {

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

    static int preIndex = 0;

    public static Node buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public static Node build(int[] preorder, int[] inorder, int is, int ie) {
        if (is > ie) return null;

        Node root = new Node(preorder[preIndex++]);

        int index = 0;
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }

        root.left = build(preorder, inorder, is, index - 1);
        root.right = build(preorder, inorder, index + 1, ie);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Node root = buildTree(preorder, inorder);

        System.out.println(root.val);
    }
}
