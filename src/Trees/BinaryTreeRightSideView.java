package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static int levels(Node root){
        if (root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void dfs(Node root, int level , List<Integer> ans){
        if (root==null) return;
        ans.set(level, root.val);
        dfs(root.left,level+1,ans);
        dfs(root.right,level+1,ans);
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

        a.left=b;
        a.right=c;

        b.left=d;
        b.right=e;

        c.left=f;
        c.right=g;

        e.left=h;
        g.right=i;


        int n= levels(a);
        List<Integer> ans=new ArrayList<>();
        for(int k=0;k<n;k++){
            ans.add(0);
        }
        dfs(a,0,ans);
        System.out.println(ans);


    }
}
