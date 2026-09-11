package Trees1;
public class Display {
    public static void display(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(15);
        Node e=new Node(3);
//        Node f=new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
       // c.right=f;

        display(a);
    }
}
