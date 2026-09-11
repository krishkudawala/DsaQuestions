package TreesAssignment;

public class MinValue {
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left),min(root.right)));
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        System.out.println(min(a));
    }
}
