package LinkedList2;

public class Cyclei {
    public static boolean cycle(Node head){
        Node slow=head;
        Node fast=head;
        if (head==null) return false;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //f.next=c;

        if (cycle(a)){
            System.out.println("Found");
        }
        else System.out.println("Not found");
    }
}
