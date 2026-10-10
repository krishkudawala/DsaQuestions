package Tree1;

public class isBalanced {
//    public static int levels(Node root){
//        if (root==null) return 0;
//        return 1+Math.max(levels(root.left),levels(root.right));
//    }
//    public static boolean balance(Node root){
//        if (root==null) return true;
//        int diff =Math.abs(levels(root.left)-levels(root.right));
//        if (diff>1) return false;
//        return balance(root.left) && balance(root.right);
//    }

    public static int levels(Node root ,boolean [] ans){
        if (root==null) return 0;
        int levelevels = levels(root.left,ans);
        int rightlevels = levels(root.right,ans);
        int diff = Math.abs(levelevels-rightlevels);
        if (diff>1) ans[0]=false;
        return 1+Math.max(levelevels,rightlevels);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        //System.out.println(balance(a));

        boolean[] ans = {true};
        levels(a, ans);
        for (boolean ele : ans) {

            System.out.println(ele);
        }
    }
}
