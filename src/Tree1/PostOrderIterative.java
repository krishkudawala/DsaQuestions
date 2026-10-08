package Tree1;

import java.util.*;

public class PostOrderIterative {
    public static void post(Node root,List<Integer> ls){
        Stack<Node> ans=new Stack<>();
        if (root!=null) ans.push(root);
        while (ans.size()>0){
            Node top=ans.pop();
            ls.add(top.val);
            if (top.left!=null) ans.push(top.left);
            if (top.right!=null) ans.push(top.right);
        }
    }
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        post(a,ans);
        Collections.reverse(ans);
        System.out.println(ans);

    }
}
