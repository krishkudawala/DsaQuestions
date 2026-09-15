package Tree1;

public class height {
    public static int heigjt(Node root){
        if (root==null) return 0;
        return 1+Math.max(heigjt(root.left),heigjt(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(10);
        Node d = new Node(10);
        Node e = new Node(10);

        a.left=b; a.right=c;
        b.left=d; b.right=e;

        System.out.println(heigjt(a)-1);
    }
}
