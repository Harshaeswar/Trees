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
public class ChildrenSumProperty
{
	public static void main(String[] args) {
		Node root = new Node(20);
		root.left=new Node(8);
		root.right=new Node(12);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		System.out.println(childrenSumProperty(root));
	}
	public static boolean childrenSumProperty(Node root){
	    if(root.left==null && root.right==null){
	        return true;
	    }
	    int sum=0;
	    if(root.left!=null){
	        sum+=root.left.data;
	    }
	    if(root.right!=null){
	        sum+=root.right.data;
	    }
	    return root.data==sum && childrenSumProperty(root.left) && childrenSumProperty(root.right);
	}
}
