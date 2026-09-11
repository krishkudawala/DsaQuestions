package LinkedList;

public class Rotate {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node rotate(Node head){
        if (head==null || head.next==null) return head;
        Node temp=head;
        int n =0;
        while (temp!=null){
            temp=temp.next;
            n++;
        }
        int k=2;
        k%=n;
        if (k==0) return head;
        Node slow=head;
        Node fast=head;
        for (int i=0;i<k;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node newhead=slow.next;
        slow.next=null;
        fast.next=head;
        return newhead;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        print(a);
        Node newhead=rotate(a);
       print(newhead);


    }
}
