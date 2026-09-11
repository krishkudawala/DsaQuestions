package BinarySearchTree;

import Array.Max;

class Node{
int val;
Node left;
Node right;
Node(int val){
    this.val=val;
}
}
public class MinimunElement {
    public static int min(Node root){
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left),min(root.right)));
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
        System.out.println(min(a));

    }
}
