package Trees1;

import java.util.ArrayList;
import java.util.List;

public class PreOrderLeetCode {
    public static void preorder(Node root, List<Integer> ans){
        if (root==null) return;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(8);
        Node g = new Node(6);
        Node h=new Node(7);
        Node i=new Node(9);

        a.left=b ;a.right=c;
        b.left=d; b.right=e;
        c.right=f; e.left=g;
        e.right=h; f.left=i;
        preorder(a,ans);
        System.out.println(ans);

    }
    }
