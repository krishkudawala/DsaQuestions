package Trees;

public class FindMinval {
    public static int min(Node root){
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static void main(String[] args) {

        Node a=new Node(0);
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        System.out.println(min(a));
    }
}
