package Tree1;

public class levels {
    public static int level(Node root){
        if (root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;

        System.out.println(level(a));
    }
}
