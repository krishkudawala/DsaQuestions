package Tree1;

import java.util.LinkedList;
import java.util.Queue;

public class levelorder {
    public static void levelorderr(Node root){
        Queue<Node> queue=new LinkedList<>();
        if (root!=null) queue.add(root);
        while (queue.size()>0){
            Node front = queue.remove();
            System.out.print(front.val+" ");
            if (front.left!=null) queue.add(front.left);
            if (front.right!=null) queue.add(front.right);
        }
    }
    public static void main(String[] args) {
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
       levelorderr(a);
    }
}
