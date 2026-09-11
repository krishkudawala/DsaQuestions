package Trees;

public class BalancedBinaryTree {
    public static int levels(Node root, boolean [] ans){
        if (root==null)return 0;
        int leftlevel=levels(root.left,ans);
        int rightlevel=levels(root.right,ans);
        int diff=Math.abs(leftlevel-rightlevel);
        if (diff>1) ans[0]=false;
        return 1+Math.max(leftlevel,rightlevel);
    }
    public static void main(String[] args) {
        boolean [] ans={true};
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        levels(a,ans);
        System.out.println(ans[0]);
    }
}
