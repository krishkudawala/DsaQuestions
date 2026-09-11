package Trees;

public class IsSameTree {
    public static Boolean same(Node p ,Node q){
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.val!=q.val) return false;
        if (!same(p.left,q.left)) return false;
        if (!same(p.right,q.right)) return false;
        else return true;
    }
    public static void main(String[] args) {
        boolean flag =true;
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        a.left=b;
        a.right=c;

        Node a1=new Node(1);
        Node a2=new Node(2);
        Node a3=new Node(3);
        a1.left=a2;
        a1.right=a3;


      same(a,a1);
      

        if (flag==true) System.out.println("Yes");
        else System.out.println("No");

    }
}
