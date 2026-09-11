package BinarySearchTree;

public class BSTtoGST {

    static int sum;
    public static void display(Node root){
        if (root==null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
    public static void reverseInOrder(Node root){
        if (root==null) return;
        reverseInOrder(root.right);
        root.val+=sum;
        sum=root.val;
        reverseInOrder(root.left);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(2);
        Node e=new Node(8);
        Node f=new Node(12);
        Node g=new Node(19);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        sum=0;
        display(a);

        System.out.println("__________________");
        reverseInOrder(a);
        display(a);

    } 
}
