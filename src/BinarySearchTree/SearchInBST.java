package BinarySearchTree;

public class SearchInBST {
    public static Node search(Node root, int val){
        if (root==null) return null;
        if (root.val<val ) return search(root.right,val);
        else if (root.val>val) return search(root.left,val);
        else return root;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(2);
        Node e=new Node(8);
        Node f=new Node(12);
        Node g=new Node(19);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        int target=12;
        Node result = search(a, target);

        if (result != null)
            System.out.println("True: " + result.val);
        else
            System.out.println("False");
    }
}
