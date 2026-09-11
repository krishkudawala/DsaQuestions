package LinkedList;

public class cycleII {
    public static Node cyclehas(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) break;
        }
        if (slow!=fast) return null;
            Node temp=head;
            while (temp!=slow) {
                slow = slow.next;
                temp = temp.next;
            }
            return slow;
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
        e.next=a;
  Node start=cyclehas(a);
  if (start!=null){
      System.out.println(start.val);
  }
  else System.out.println("not");
    }
}
