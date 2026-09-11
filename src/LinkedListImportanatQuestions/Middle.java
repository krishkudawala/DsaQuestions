package LinkedListImportanatQuestions;

public class Middle {
    public static void middle(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println( slow.val);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
//        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
//        d.next=e;

        middle(a);
    }
}
