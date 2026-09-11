package LinkedList;
public class rr {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
    }
    public static Node reverse(Node head){
        Node current=head;
        Node per=null;
        Node next=head;
        while (current!=null) {
            next = current.next;
            current.next = per;
            per = current;
            current = next;
        }
        return per;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node newhead=reverse(a);
        print(newhead);
    }
}
