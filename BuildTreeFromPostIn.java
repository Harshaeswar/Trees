public class BuildTreeFromPostIn {

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

    static int postindex = 0;

    public static Node buildTree(int[] inorder, int[] postorder) {
        postindex = postorder.length - 1;
        return build(inorder, postorder, 0, inorder.length - 1);
    }

    public static Node build(int[] inorder, int[] postorder, int is, int ie) {
        if (is > ie) return null;

        Node root = new Node(postorder[postindex--]);

        int index = 0;
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }

        root.right = build(inorder, postorder, index + 1, ie);
        root.left = build(inorder, postorder, is, index - 1);

        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        Node root = buildTree(inorder, postorder);
        System.out.println(root.val);
    }
}
