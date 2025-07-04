import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        
    }
}
public class NodesAtKDistance
{ 
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right=new Node(30);
		root.right.right=new Node(70);
		root.right.right.right= new Node(80);
		printNodesAtKDistance(root,2);
	}
	public static void printNodesAtKDistance(Node root,int k){
	    if(root==null){
	        return;
	    }
	    else if(k==0){
	        System.out.println(root.data);
	        return;
	    }
	    else{
	        printNodesAtKDistance(root.left,k-1);
	        printNodesAtKDistance(root.right,k-1);
	    }
	}
}
