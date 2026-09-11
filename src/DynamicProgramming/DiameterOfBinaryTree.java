package DynamicProgramming;


class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class DiameterOfBinaryTree {
    public static int levels(Node root,int [] maxDia){
        if(root==null) return 0;
        int leftLevel=levels(root.left,maxDia);
        int rightLevel=levels(root.right,maxDia);
        int myDia=leftLevel + rightLevel;
        maxDia[0]=Math.max(maxDia[0],myDia);
        return 1+Math.max(leftLevel,rightLevel);
    }


    public static void main(String[] args) {
        int []maxDia={0};
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.left=b; a.right=c;
        b.left=d;b.right=e;
        System.out.println(levels(a,maxDia));
    }
}
