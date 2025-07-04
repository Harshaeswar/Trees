import java.util.*;

public class RightSideView {

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

    public static List<Integer> rightSideView(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        if (root == null) return l;
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (i == count - 1) l.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2, null, new Node(5));
        root.right = new Node(3, null, new Node(4));

        List<Integer> result = rightSideView(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
