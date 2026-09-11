package Trees;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class NodesofTrees {
    public static void display(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(2);
        Node c=new Node(7);
        Node d=new Node(1);
        Node e=new Node(3);

        a.left=b; a.right=c;
        b.left=e; b.right=d;

       display(a);
    }
}
