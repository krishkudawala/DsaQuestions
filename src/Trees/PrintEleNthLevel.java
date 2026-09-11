package Trees;

import java.util.Scanner;

public class PrintEleNthLevel {
     static Scanner sc=new Scanner(System.in);
   static int n=sc.nextInt();
    public static void Nthorder(Node root,int level){
        if(root==null) return;
        if (level==n) System.out.print(root.val+" ");
        Nthorder(root.left,level+1);
        Nthorder(root.right,level+1);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.left=b; a.right=c;
        b.left=d; b.right=e;

        Nthorder(a,0);
        System.out.println();

        for (int x=0;x<=3;x++){
            n=x;
            Nthorder(a,0);
            System.out.println();
        }
    }
}
