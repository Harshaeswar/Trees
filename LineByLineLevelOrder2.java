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
public class LineByLineLevelOrder2
{
	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.right= new Node(60);
		levelOrderTraversal(root);
	}
	public static void levelOrderTraversal(Node root){
	    Queue <Node> q = new LinkedList<>();
	    q.add(root);
	    q.add(null);
	    while(!q.isEmpty()){
	        Node curr = q.poll();
	        /*if(curr==null && q.size()==0){
	            break;
	        }*/
	        if(curr==null){
	            System.out.println();
	            if(q.size()!=0){
	                q.add(null);
	            }
	            continue;
	        }
	        System.out.print(curr.data+" ");
	        if(curr.left!=null){
	            q.add(curr.left);
	        }
	        if(curr.right!=null){
	            q.add(curr.right);
	        }
	    }
	}
}