package LinkedList2;

public class partition {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node partation(Node head){
        int x=3;
        Node a=new Node(-1);
        Node b=new Node(-1);
        Node tempa=a;
        Node tempb=b;
        Node temp=head;
        while (temp!=null){
            if (temp.val<x){
                tempa.next=temp;
                tempa=tempa.next;
            }
            else {
                tempb.next=temp;
                tempb=tempb.next;
            }
            temp=temp.next;
        }
        tempb.next=null;
        a=a.next;
        b=b.next;
        if (a==null) return b;
        tempa.next=b;
        return a;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(2);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
 print(a);
        partation(a);
        print(a);
    }
}
