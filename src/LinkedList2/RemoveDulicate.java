package LinkedList2;

public class    RemoveDulicate {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node remove(Node head){
        Node a=head;
        Node b=head;
        while (b!=null){
            if (b.val==a.val) b=b.next;
            else {
                a.next=b;
                a=b;
            }
        }
        a.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(10);
        Node c=new Node(20);
        Node d=new Node(20);
        Node e=new Node(30);
        Node f=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        remove(a);
        print(a);


    }
}
