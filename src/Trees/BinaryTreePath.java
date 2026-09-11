package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public static void path(Node root, String s, List<String> ans){
        if(root==null) return;

        // add current node to path
        if(s.length() == 0){
            s = "" + root.val;
        } else {
            s = s + "->" + root.val;
        }

        // if leaf node
        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }

        path(root.left, s, ans);
        path(root.right, s, ans);
    }

    public static void main(String[] args) {
        List<String> ans=new ArrayList<>();
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        e.left=f;
        Node root=a;
        path(root,"",ans);
        System.out.println(ans);


    }
}
