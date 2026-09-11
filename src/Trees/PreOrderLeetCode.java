package Trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrderLeetCode {
    public static void preorder(Node root, ArrayList<Integer> ans){
         if (root==null) return;
         ans.add(root.val);
         preorder(root.left,ans);
         preorder(root.right,ans);
    }
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        Node a=new Node(1);
        Node c=new Node(2);
        Node d=new Node(3);

        a.right=c; c.left=d;
        preorder(a, (ArrayList<Integer>) ans);
        System.out.println(ans);
    }
}
