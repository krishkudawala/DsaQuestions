package Trees;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

class pair{
    Node node;
    int level;
    pair(Node node ,int level){
        this.node=node;
        this.level=level;
    }
}
public class PairLevelTraversal {
    public static void levelorder(Node  root){
        int prevlevel=0;
        Queue<pair> q=new ArrayDeque<>();
        if(root!=null) q.add(new pair(root,0));
        while (q.size()>0){
            pair front=q.remove();
            Node temp =front.node;
            int lvl=front.level;
            if (lvl!=prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new pair(temp.right,lvl+1));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        e.left=f;
        levelorder(a);



    }

}
