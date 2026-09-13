package Tree1;

public class Size {
    public static int size(Node root){
        if (root==null) return 0;
        return root.val +size(root.left)+size(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(1);
        Node d=new Node(1);
        Node r=new Node(1);
        Node i=new Node(1);

        a.left=b; a.right=c;
        b.left=d; b.right=r;
        c.left=i;

        System.out.println(size(a));
    }
}
