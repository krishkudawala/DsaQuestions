package Trees;

public class Traversal {
    public static void perorder(Node root){
        if (root==null) return ;
        System.out.print(root.val+" ");
        perorder(root.left);
        perorder(root.right);
    }
    public static void inorder(Node root){
        if (root==null) return ;
        perorder(root.left);
        System.out.print(root.val+" ");
        perorder(root.right);
    }
    public static void postorder(Node root){
        if (root==null) return ;
        perorder(root.left);
        perorder(root.right);
        System.out.print(root.val+" ");
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

        perorder(a);
        System.out.println( );
        inorder(a);
        System.out.println();
        postorder(a);


    }
}
