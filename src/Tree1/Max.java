package Tree1;

public class Max {
    public static int maxx(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxx(root.left),maxx(root.right)));
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(3);
        Node e=new Node(7);

        a.left=b; a.right=c;
        b.left=d;b.right=e;
        System.out.println(maxx(a));
    }
}
