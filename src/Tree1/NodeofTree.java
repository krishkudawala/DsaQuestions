package Tree1;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class NodeofTree {
    public static void print(Node root){
        if (root==null) return;
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        print(a);

    }
}
