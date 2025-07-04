import java.util.*;

public class LowestCommonAncestor {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        ArrayList<Node> al1 = new ArrayList<>();
        ArrayList<Node> al2 = new ArrayList<>();
        if (!findPath(root, p, al1) || !findPath(root, q, al2)) {
            return null;
        }
        int i = 0;
        while (i < al1.size() && i < al2.size() && al1.get(i).val == al2.get(i).val) {
            i++;
        }
        return al1.get(i - 1);
    }

    public static boolean findPath(Node root, Node p, ArrayList<Node> al) {
        if (root == null) return false;
        al.add(root);
        if (root.val == p.val) return true;
        if (findPath(root.left, p, al) || findPath(root.right, p, al)) return true;
        al.remove(al.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Node p = root.left;
        Node q = root.left.right.right;

        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
}
