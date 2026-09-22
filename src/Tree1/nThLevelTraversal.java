package Tree1;

import java.util.Scanner;

public class nThLevelTraversal {
     static Scanner sc=new Scanner(System.in);
     static int n= sc.nextInt();
    public static void nthlev(Node root ,int level){

        if (root==null) return;

        if (level==n) System.out.print(root.val+" ");
        nthlev(root.left,level+1);
        nthlev(root.right,level+1);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);


        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h; f.right=i;


        nthlev(a,0);
    }
}
