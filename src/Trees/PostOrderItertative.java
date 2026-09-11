package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderItertative {
    public static void postorder(Node root){
        Stack<Node> s=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        if (root!=null) s.push(root);
        while (s.size()>0){
            Node top=s.pop();
            ans.add(top.val);
            if (top.left!=null) s.push(top.left);
            if (top.right!=null) s.push(top.right);
        }
        Collections.reverse(ans);
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
//        Node f=new Node(6);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        //c.left=f;

        postorder(a);

    }
}
