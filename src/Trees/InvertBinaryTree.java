package Trees;

public class InvertBinaryTree {
    public static void display(Node root){
        if (root==null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);

    }
    public static void invert(Node root){
        if(root==null) return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(15);
        Node e=new Node(2);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        System.out.println("Before invert : ");
        display(a);
        invert(a);
        System.out.println("After invert: ");
        display(a);
    }
}
