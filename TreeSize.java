import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class TreeSize
{
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.right= new Node(60);
		System.out.println(size(root));
	}
	public static int size(Node root){
	    if(root == null){
	        return 0;
	    }
	    else{
	        return 1+size(root.left)+size(root.right);
	    }
	}
}
