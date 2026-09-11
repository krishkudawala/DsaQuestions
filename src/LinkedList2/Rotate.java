package LinkedList2;

public class Rotate {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node rorate(Node head){
        int k=2;
        Node temp=head;
        int n=0;
        while (temp!=null){
            temp=temp.next;
            n++;
        }
        k=k%n;

        Node slow=head;
        Node fast=head;
      if (k==0) return head;
        for (int i=1;i<=k;i++){
            fast=fast.next;
        }
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node newhead=slow.next;
        slow.next=null;
        fast.next=head;
        return newhead;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node neww=rorate(a);
        print(neww);
    }
}
