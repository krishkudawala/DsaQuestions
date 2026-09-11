package LinkedList;
public class reverseIterative {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
           temp=temp.next;
        }
    }
    public static Node reverse(Node head){
        Node current=head;
        Node previous=null;
        Node next=head;

        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;

//        reverse(a);
//        print(d);

        Node newhead=reverse(a);
        print(newhead);
    }
}
