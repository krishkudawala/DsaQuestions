package LinkedList;

public class Cycle {
    public static boolean cycles(Node head){
        if (head==null) return false;
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
            return false;
    }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b =new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        Node f =new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=b;

       if (cycles(a)){
           System.out.println("true");
       }
       else {
           System.out.println("false");
       }
    }
}
