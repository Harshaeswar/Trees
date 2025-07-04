class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class PostOrder
{
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		System.out.println("Postorder");
		postorder(root);
	
	}
	public static void postorder(Node root){
	    if(root!=null){
    	    postorder(root.left);
    	    postorder(root.right);
    	    System.out.print(root.data+"->");
	    }
	}
}
