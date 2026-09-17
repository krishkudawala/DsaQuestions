package Tree1;

public class same {
    public static Boolean issame(Node p,Node q){
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.val!=q.val) return false;
        if (!issame(p.left,q.left)) return false;
        if (!issame(p.right,q.right)) return false;
        return true;
    }
    public static void main(String[] args) {
        Node a1=new Node(1);
        Node b1=new Node(2);
        Node c1=new Node(3);
        Node d1=new Node(4);
        Node e1=new Node(5);
        Node f1=new Node(6);
        Node g1=new Node(7);

        a1.left=b1; a1.right=c1;
        b1.left=d1; b1.right=e1;
        c1.left=f1; c1.right=g1;

        Node a2=new Node(1);
        Node b2=new Node(2);
        Node c2=new Node(3);
        Node d2=new Node(4);
        Node e2=new Node(5);
        Node f2=new Node(6);
        Node g2=new Node(7);

        a2.left=b2; a2.right=c2;
        b2.left=d2; b2.right=e2;
        c2.left=f2; c2.right=g2;

        System.out.println(issame(a1,a2));
    }
}
