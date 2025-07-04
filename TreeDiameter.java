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
public class TreeDiameter
{
    static int res=0;
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.right= new Node(60);
		diameter(root);
		System.out.println(res);
	}
	public static int diameter(Node root){
	    if(root==null){
	        return 0;
	    }
	    int lh=diameter(root.left);
	    int rh=diameter(root.right);
	    res=Math.max(res,lh+rh+1);
	    return Math.max(lh,rh)+1;
	}
	
}