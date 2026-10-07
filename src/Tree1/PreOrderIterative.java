package Tree1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
    public static void pre(Node root, List<Integer> ls){
        Stack <Node> st=new Stack<>();
         st.push(root);
        while (st.size()>0){
            Node top=st.pop();
            ls.add(top.val);
            if (top.right!=null) st.push(top.right);
            if (top.left!=null) st.push(top.left);
        }
    }
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
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

        pre(a,ls);
        System.out.println(ls);

    }
}
