package HashMaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class TopView {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node ,int level){
           this.node=node;
            this.level=level;
        }
    }
    public static void topView(Node root) {
        HashMap<Integer,Integer> map=new HashMap<>();

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int minlevel=Integer.MAX_VALUE;
        int maxlevel=Integer.MIN_VALUE;
        while (q.size()>0){
            Pair temp=q.remove();
            Node n=temp.node;
            int lvl=temp.level;
            minlevel=Math.min(minlevel,lvl);
            maxlevel=Math.max(maxlevel,lvl);
            if (!map.containsKey(lvl))
                map.put(lvl, n.val);
            if (n.left!=null) q.add(new Pair(n.left,lvl-1));
            if (n.right!=null) q.add(new Pair(n.right,lvl+1));
        }
        for (int i=minlevel;i<=maxlevel;i++){
            System.out.print(map.get(i)+" ");
        }
    }
    public static void main(String[] args) {

        Node a=new Node(2);
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        topView(a);
    }
}
