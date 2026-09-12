package Tree1;

public class Min {
    public static int min(Node root) {
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left),min(root.right)));
    }
    public static void main(String[] args) {
        Node h=new Node(100);
        Node i=new Node(20);
        Node j=new Node(30);
        Node k=new Node(40);
        Node l=new Node(50);

        h.left=i; h.right=j;
        i.left=k; i.right=l;

        System.out.println(min(h));
    }
}
