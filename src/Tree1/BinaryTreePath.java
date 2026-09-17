package Tree1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public static void path(Node root,String s,List<String> ans){
        if (root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        path(root.left, s+root.val+"->", ans);
        path(root.right, s+root.val+"->", ans);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(6);
        Node i = new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        d.left=h;d.right=i;

        List<String> ans=new ArrayList<>();

        path(a,"",ans);
        System.out.println(ans);

    }
}
