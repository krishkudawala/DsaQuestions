package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIterative {
    public static List<Integer> inorder(Node root){
        List<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while (true){
            if (temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else {
                if (st.size()==0) break;
                Node top=st.pop();
                ans.add(top.val);
                temp=top.right;
            }
        }
        return ans;
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

        System.out.println(inorder(a));
    }
}
