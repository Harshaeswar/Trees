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
public class PreOrder
{
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.right.left=new Node(40);
		root.right.right=new Node(50);
		System.out.println("Preorder");
		preorder(root);
	
	}
	public static void preorder(Node root){
	    if(root!=null){
    	    System.out.print(root.data+"->");
    	    preorder(root.left);
    	    preorder(root.right);
	    }
	}

}
