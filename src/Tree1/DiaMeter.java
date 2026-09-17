package Tree1;

public class DiaMeter {
    public static int max(int a,int b,int c){
        return Math.max(a,Math.min(b,c));
    }
    public static int levels(Node root){
        if (root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(6);
        Node i = new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        d.left=h;d.right=i;


        int mydia=levels(a.left)+levels(a.right);
        int leftdia=levels(a.left);
        int rightdia=levels(a.right);

        System.out.println(max(mydia,leftdia,rightdia));
    }
}
