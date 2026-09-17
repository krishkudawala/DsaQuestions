package Tree1;

public class InvertBinaryTree {
    public static void display(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void invert(Node root){
        if (root==null) return ;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        invert(root.left);
        invert(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        display(a);
        System.out.println();
        System.out.println("_________________________________________");
        invert(a);
        display(a);

    }
}
