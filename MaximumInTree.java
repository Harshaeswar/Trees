import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class MaximumInTree
{
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.right= new Node(60);
		System.out.println(maximumInTree(root));
	}
	public static int maximumInTree(Node root){
	    if(root==null){
	        return Integer.MIN_VALUE;
	    }
	    else{
	        return Math.max(root.data,Math.max(maximumInTree(root.left),maximumInTree(root.right)));
	    }
	}
}
